# Challenge ONE | Back End | Java + Spring

<p align="center" >
     <img width="200" heigth="200" src="https://user-images.githubusercontent.com/78982435/209698701-4c2cf2cf-e9b8-4985-9aec-9dee5b96ce8a.png">
</p>

## 🔸 Bem vindos ao repositório do projeto Forum Hub 🔸

Este é um dos Challenges do programa **ONE - Oracle Next Education**.

🔹 `Desafio:` 

- Desenvolver uma API REST para um fórum
- Implementar um CRUD (Create, Read, Update, Delete) para os tópicos
- Validações realizadas segundo as regras de negócio
- Implementação de uma base de dados para a persistência da informação
- Serviço de autenticação/autorização para restringir o acesso à informação

## 🔸 Passos fundamentais

✅ `Passo 1:` Criar o projeto com Spring Initializr

✅ `Passo 2:` Implementar as classes Model

✅ `Passo 3:` Implementar as classes Repository

✅ `Passo 4:` Implementar as classes Controller

✅ `Passo 5:` Implementar as validações

✅ `Passo 6:` Implementar a autenticação/autorização

✅ `Passo 7:` Implementar a base de dados

## 🔸 Tecnologias utilizadas:

- Java
- Spring Boot
- Spring Security
- Spring Data JPA
- MySQL
- JWT (JSON Web Token)
- Maven

## 🔸 Como baixar e executar o projeto:

### Pré-requisitos:
- Java 17 ou superior
- MySQL
- Maven

### Passos:

1. Clone o repositório:
```bash
git clone https://github.com/rodrigoborge/Forum-Hub.git
```

2. Configure o banco de dados MySQL no arquivo `application.properties`

3. Execute o projeto:
```bash
mvn spring-boot:run
```

## 🔸 Funcionalidades da API:

### Endpoints principais:

- `POST /auth/login` - Autenticação de usuário
- `GET /topicos` - Listar todos os tópicos
- `POST /topicos` - Criar um novo tópico
- `GET /topicos/{id}` - Buscar tópico por ID
- `PUT /topicos/{id}` - Atualizar tópico
- `DELETE /topicos/{id}` - Deletar tópico

## 🔸 Estrutura do projeto:

```
src/
├── main/
│   ├── java/
│   │   └── com/forumhub/
│   │       ├── controller/
│   │       ├── model/
│   │       ├── repository/
│   │       ├── service/
│   │       ├── dto/
│   │       ├── config/
│   │       └── exception/
│   └── resources/
│       └── application.properties
└── test/
```

---

## 🔸 Autor

[<img src="https://avatars.githubusercontent.com/u/rodrigoborge?v=4" width=115><br><sub>Rodrigo Borge</sub>](https://github.com/rodrigoborge)

---

<p align="center">
     <img width="600" heigth="600" src="https://user-images.githubusercontent.com/78982435/209698701-4c2cf2cf-e9b8-4985-9aec-9dee5b96ce8a.png">
</p>

<p align="center">
<img src="https://img.shields.io/badge/STATUS-CONCLUÍDO-green">
</p>
