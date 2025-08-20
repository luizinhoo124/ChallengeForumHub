# 🚀 Forum Hub - Challenge ONE Back End

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.0-brightgreen)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue)
![JWT](https://img.shields.io/badge/JWT-Security-red)
![Status](https://img.shields.io/badge/Status-Concluído-success)

## 📋 Sobre o Projeto

Desenvolvi este projeto como parte do **Challenge ONE Back End** da Oracle Next Education em parceria com a Alura. O Forum Hub é uma API REST completa para gerenciamento de fóruns de discussão, implementando todas as funcionalidades essenciais de um sistema moderno de tópicos e respostas.

## 🎯 Objetivo do Challenge

O desafio consistia em criar uma API REST funcional que replicasse o funcionamento de um fórum, onde usuários podem:
- Criar e gerenciar tópicos de discussão
- Responder a tópicos existentes
- Autenticar-se de forma segura
- Gerenciar perfis de usuário

## ✨ Funcionalidades Implementadas

### 🔐 Autenticação e Segurança
- [x] Sistema de autenticação JWT
- [x] Registro e login de usuários
- [x] Proteção de rotas sensíveis
- [x] Validação de tokens

### 📝 Gerenciamento de Tópicos
- [x] Criar novos tópicos
- [x] Listar tópicos com paginação
- [x] Buscar tópico por ID
- [x] Atualizar tópicos existentes
- [x] Excluir tópicos
- [x] Validação de dados de entrada

### 💬 Sistema de Respostas
- [x] Adicionar respostas aos tópicos
- [x] Listar respostas por tópico
- [x] Gerenciar respostas dos usuários

### 👥 Gerenciamento de Usuários
- [x] Cadastro de novos usuários
- [x] Perfis de usuário
- [x] Associação de tópicos e respostas aos usuários

## 🛠️ Tecnologias Utilizadas

- **Java 17** - Linguagem principal
- **Spring Boot 3.0** - Framework principal
- **Spring Security** - Segurança e autenticação
- **Spring Data JPA** - Persistência de dados
- **MySQL** - Banco de dados
- **JWT** - Autenticação stateless
- **Bean Validation** - Validação de dados
- **Maven** - Gerenciamento de dependências
- **Flyway** - Migração de banco de dados

## 🚀 Como Executar o Projeto

### Pré-requisitos
- Java 17 ou superior
- MySQL 8.0 ou superior
- Maven 3.6 ou superior

### Configuração do Ambiente

1. **Clone o repositório:**
```bash
git clone https://github.com/luizinhoo124/ChallengeForumHub.git
cd ChallengeForumHub
```

2. **Configure o banco de dados:**
```sql
CREATE DATABASE forum_hub;
```

3. **Configure as variáveis de ambiente:**
```bash
cp .env.example .env
```

Edite o arquivo `.env` com suas configurações:
```properties
DB_HOST=localhost
DB_PORT=3306
DB_NAME=forum_hub
DB_USERNAME=seu_usuario
DB_PASSWORD=sua_senha
JWT_SECRET=sua_chave_secreta_jwt
```

4. **Execute o projeto:**
```bash
mvn spring-boot:run
```

A API estará disponível em: `http://localhost:8080`

## 📚 Documentação da API

### Autenticação

#### POST `/auth/login`
```json
{
  "email": "usuario@email.com",
  "senha": "123456"
}
```

#### POST `/auth/register`
```json
{
  "nome": "Nome do Usuário",
  "email": "usuario@email.com",
  "senha": "123456"
}
```

### Tópicos

#### GET `/topicos`
- Lista todos os tópicos (paginado)
- Parâmetros: `page`, `size`, `sort`

#### POST `/topicos`
```json
{
  "titulo": "Título do Tópico",
  "mensagem": "Conteúdo da mensagem",
  "curso": "Nome do Curso"
}
```

#### GET `/topicos/{id}`
- Busca tópico específico por ID

#### PUT `/topicos/{id}`
```json
{
  "titulo": "Novo Título",
  "mensagem": "Nova Mensagem"
}
```

#### DELETE `/topicos/{id}`
- Remove tópico específico

### Respostas

#### POST `/topicos/{id}/respostas`
```json
{
  "mensagem": "Conteúdo da resposta"
}
```

#### GET `/topicos/{id}/respostas`
- Lista respostas de um tópico

## 📁 Estrutura do Projeto

```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── forumhub/
│   │           ├── ForumHubApplication.java
│   │           ├── config/
│   │           │   ├── SecurityConfig.java
│   │           │   └── CorsConfig.java
│   │           ├── controller/
│   │           │   ├── AuthController.java
│   │           │   ├── TopicoController.java
│   │           │   └── RespostaController.java
│   │           ├── dto/
│   │           │   ├── auth/
│   │           │   ├── topico/
│   │           │   └── resposta/
│   │           ├── model/
│   │           │   ├── Usuario.java
│   │           │   ├── Topico.java
│   │           │   └── Resposta.java
│   │           ├── repository/
│   │           │   ├── UsuarioRepository.java
│   │           │   ├── TopicoRepository.java
│   │           │   └── RespostaRepository.java
│   │           ├── service/
│   │           │   ├── AuthService.java
│   │           │   ├── TopicoService.java
│   │           │   └── TokenService.java
│   │           └── exception/
│   │               └── GlobalExceptionHandler.java
│   └── resources/
│       ├── application.properties
│       └── db/migration/
└── test/
```

## 🎓 Aprendizados

Durante o desenvolvimento deste projeto, aprofundei meus conhecimentos em:

- **Spring Security**: Implementação de autenticação JWT
- **JPA/Hibernate**: Relacionamentos entre entidades
- **Validação de Dados**: Bean Validation e tratamento de erros
- **API REST**: Boas práticas e padronização
- **Banco de Dados**: Modelagem e migrações com Flyway
- **Segurança**: Proteção contra vulnerabilidades comuns

## 🤝 Como Contribuir

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/AmazingFeature`)
3. Commit suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. Push para a branch (`git push origin feature/AmazingFeature`)
5. Abra um Pull Request

## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## 🙏 Agradecimentos

- **Oracle Next Education** pela oportunidade do challenge
- **Alura** pela excelente plataforma de ensino
- **Comunidade Spring** pela documentação e suporte

---

⭐ **Desenvolvido com dedicação durante o Challenge ONE Back End**

📧 **Contato**: [Seu Email]
🔗 **LinkedIn**: [Seu LinkedIn]
🐱 **GitHub**: [@luizinhoo124](https://github.com/luizinhoo124)