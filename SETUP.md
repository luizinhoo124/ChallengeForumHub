# 🚀 Configuração do Projeto Forum Hub

## 📋 Pré-requisitos

- Java 17 ou superior
- Maven 3.6 ou superior
- MySQL 8.0 ou superior
- IDE de sua preferência (IntelliJ IDEA, Eclipse, VS Code)

## ⚙️ Configuração do Ambiente

### 1. Clone o repositório
```bash
git clone https://github.com/seu-usuario/ChallengeForumHub.git
cd ChallengeForumHub
```

### 2. Configuração do Banco de Dados

1. Instale e configure o MySQL
2. Crie um banco de dados chamado `forumhub`:
```sql
CREATE DATABASE forumhub;
```

### 3. Configuração das Variáveis de Ambiente

1. Copie o arquivo `.env.example` para `.env`:
```bash
cp .env.example .env
```

2. Edite o arquivo `.env` com suas configurações:
```env
# Configurações do Banco de Dados
DB_URL=jdbc:mysql://localhost:3306/forumhub?currentSchema=public
DB_USERNAME=seu_usuario_mysql
DB_PASSWORD=sua_senha_mysql

# Configurações de Segurança
JWT_SECRET=sua_chave_secreta_jwt_aqui

# Configurações da Aplicação
SPRING_PROFILES_ACTIVE=dev

# Configurações do Hibernate
HIBERNATE_DDL_AUTO=update
HIBERNATE_SHOW_SQL=true
HIBERNATE_DIALECT=org.hibernate.dialect.MySQLDialect
```

### 4. Instalação das Dependências

```bash
mvn clean install
```

### 5. Execução da Aplicação

```bash
mvn spring-boot:run
```

A aplicação estará disponível em: `http://localhost:8080`

## 🔒 Segurança

- **NUNCA** commite o arquivo `.env` no repositório
- Use senhas fortes para o banco de dados
- Gere uma chave JWT segura para produção
- Em produção, configure as variáveis de ambiente no servidor

## 🧪 Testes

```bash
mvn test
```

## 📚 Documentação da API

Após iniciar a aplicação, acesse:
- Swagger UI: `http://localhost:8080/swagger-ui.html`
- API Docs: `http://localhost:8080/v3/api-docs`

## 🛠️ Desenvolvimento

### Estrutura do Projeto
```
src/
├── main/
│   ├── java/
│   │   └── br/com/forumhub/app/
│   │       ├── config/          # Configurações
│   │       ├── controller/      # Controllers REST
│   │       ├── dto/            # Data Transfer Objects
│   │       ├── model/          # Entidades JPA
│   │       ├── repository/     # Repositórios
│   │       └── service/        # Serviços de negócio
│   └── resources/
│       └── application.properties
└── test/
    └── java/
```

### Comandos Úteis

- Compilar: `mvn compile`
- Executar testes: `mvn test`
- Gerar JAR: `mvn package`
- Limpar build: `mvn clean`
- Executar aplicação: `mvn spring-boot:run`