# Desafio Fórum Hub - API REST com Java e Spring Boot

<div align="center">

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Java Version](https://img.shields.io/badge/Java-8%2B-blue)](https://www.java.com/)
![GitHub repo size](https://img.shields.io/github/repo-size/rodrigoborge/coonversor-moedas-java)
![GitHub code size in bytes](https://img.shields.io/github/languages/code-size/rodrigoborge/coonversor-moedas-java)

</div><br>

## Badge

Este é um badge conquistado por ter desenvolvido este projeto com a Alura no programa ONE - "Oracle Next Education" em parceria com a Oracle:

<div align="center">

![Badge](img/badge.png)

</div>

## Descrição do Desafio

O desafio Fórum Hub consiste na criação de uma API REST utilizando Java e Spring Boot. Este desafio tem como objetivo proporcionar uma experiência prática do papel de um desenvolvedor back-end, permitindo a aplicação de conceitos avançados de Java e Spring Boot, como criação de endpoints e implementação de camadas de segurança. A realização deste desafio é essencial para o programa ONE, pois permite a consolidação dos conhecimentos adquiridos.

## Estrutura do Projeto

O projeto está estruturado de acordo com as melhores práticas para desenvolvimento com Spring Boot, seguindo a arquitetura MVC (Model-View-Controller). A estrutura do diretório é a seguinte:

```bash
forum-hub/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── forumhub/
│   │   │           ├── controller/
│   │   │           ├── model/
│   │   │           ├── repository/
│   │   │           ├── service/
│   │   │           └── ForumHubApplication.java
│   │   └── resources/
│   │       ├── application.properties
│   └── test/
│       └── java/
│           └── com/
│               └── forumhub/
├── .gitignore
├── README.md
└── pom.xml
```

## Funcionalidades

A API REST do Fórum Hub possui as seguintes funcionalidades:

- **Endpoints de Usuários:**
  - Criação de novos usuários.
  - Autenticação e login de usuários.
  - Recuperação de informações de perfil.

- **Endpoints de Tópicos:**
  - Criação de novos tópicos.
  - Listagem de tópicos.
  - Atualização e exclusão de tópicos.

- **Endpoints de Respostas:**
  - Criação de novas respostas em tópicos.
  - Listagem de respostas em um tópico específico.

- **Segurança:**
  - Implementação de autenticação JWT para proteger os endpoints.
  - Configuração de segurança para diferentes níveis de acesso.

## Tecnologias Utilizadas

- **Java 17:** Linguagem de programação utilizada para o desenvolvimento da API.
- **Spring Boot:** Framework utilizado para a criação da aplicação.
- **Spring Security:** Utilizado para implementação das camadas de segurança.
- **JWT (JSON Web Token):** Utilizado para autenticação dos usuários.
- **H2 Database:** Banco de dados em memória utilizado para testes.
- **Maven:** Ferramenta de gerenciamento de dependências e build.

## Configuração do Ambiente

Para configurar o ambiente de desenvolvimento, siga os passos abaixo:

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/seu-usuario/forum-hub.git
   cd forum-hub

2. **Instale as dependências do Maven:**
   ```bash
   mvn install
   ```
3. **Execute a aplicação:**
   ```bash
   mvn spring-boot:run
   ```
  A aplicação estará disponível em `http://localhost:8080`.

## Testes
Os testes unitários e de integração estão localizados no diretório src/test/java/com/forumhub. Para executar os testes, utilize o comando:
```bash
mvn test
```

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para enviar sugestões, correções de bugs ou melhorias através de issues e pull requests.

## Licença

Este projeto está licenciado sob a [Licença MIT](LICENSE)
