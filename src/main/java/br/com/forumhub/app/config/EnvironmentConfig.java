package br.com.forumhub.app.config;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * Configuração para carregar variáveis de ambiente do arquivo .env
 * Garante que as configurações sensíveis não sejam expostas no código
 */
@Configuration
public class EnvironmentConfig {

    @PostConstruct
    public void loadEnvironmentVariables() {
        try {
            Dotenv dotenv = Dotenv.configure()
                    .ignoreIfMissing()
                    .load();
            
            // Define as variáveis de ambiente do sistema se não estiverem definidas
            dotenv.entries().forEach(entry -> {
                if (System.getProperty(entry.getKey()) == null) {
                    System.setProperty(entry.getKey(), entry.getValue());
                }
            });
        } catch (Exception e) {
            // Em produção, as variáveis devem estar definidas no sistema
            System.out.println("Arquivo .env não encontrado. Usando variáveis de ambiente do sistema.");
        }
    }
}