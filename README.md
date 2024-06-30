# Gerenciamento de Vagas de Trabalho

Bem-vindo ao repositório do projeto **Gerenciamento de Vagas de Trabalho**. Este projeto foi desenvolvido para gerenciar vagas de trabalho, candidaturas e autenticação de candidatos e empresas.

## Índice

- [Visão Geral](#visão-geral)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Instalação](#instalação)
- [Uso](#uso)
- [Endpoints](#endpoints)
- [Contato](#contato)

## Visão Geral

O projeto **Gerenciamento de Vagas de Trabalho** é uma aplicação Java que permite:
- Cadastrar e autenticar candidatos
- Cadastrar e autenticar empresas
- Listar vagas de trabalho com base em filtros
- Gerenciar perfis de candidatos

## Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Security
- Hibernate
- JPA
- Swagger/OpenAPI para documentação da API

## Instalação

### Instalação Local

1. Clone o repositório:
    ```sh
    git clone https://github.com/PedroTxfl/Gerenciamento-de-vagas-de-trabalho.git
    ```

2. Navegue até o diretório do projeto:
    ```sh
    cd Gerenciamento-de-vagas-de-trabalho
    ```

3. Compile e execute a aplicação:
    ```sh
    ./mvnw spring-boot:run
    ```

### Usando Docker Compose

1. Certifique-se de ter o Docker e o Docker Compose instalados em sua máquina. Se não tiver, você pode seguir as instruções de instalação no site oficial do [Docker](https://docs.docker.com/get-docker/) e [Docker Compose](https://docs.docker.com/compose/install/).

2. Clone o repositório:
    ```sh
    git clone https://github.com/PedroTxfl/Gerenciamento-de-vagas-de-trabalho.git
    ```

3. Navegue até o diretório do projeto:
    ```sh
    cd Gerenciamento-de-vagas-de-trabalho
    ```

4. Execute o Docker Compose para construir e iniciar os contêineres:
    ```sh
    docker-compose up --build
    ```

   Isso irá construir as imagens Docker e iniciar os contêineres definidos no arquivo `docker-compose.yml`.

5. Acesse a aplicação em:
    ```
    http://localhost:8080
    ```
## Uso

Após iniciar a aplicação, você pode acessar a documentação da API via Swagger em:

http://localhost:8080/swagger-ui.html#/


## Endpoints

### Autenticação de Empresa
- **POST** `/company/auth`
    - Descrição: Autentica uma empresa
    - Request Body: `AuthCompanyDTO`
    - Response: Token JWT

### Cadastro de Empresa
- **POST** `/company`
    - Descrição: Cadastra uma nova empresa
    - Request Body: `CompanyEntity`
    - Response: Detalhes da empresa cadastrada

### Autenticação de Candidato
- **POST** `/candidate/auth`
    - Descrição: Autentica um candidato
    - Request Body: `AuthCandidateRequestDTO`
    - Response: Token JWT

### Cadastro de Candidato
- **POST** `/candidate`
    - Descrição: Cadastra um novo candidato
    - Request Body: `CandidateEntity`
    - Response: Detalhes do candidato cadastrado

### Perfil do Candidato
- **GET** `/candidate`
    - Descrição: Retorna o perfil do candidato autenticado

### Listagem de Vagas
- **GET** `/candidate/job`
    - Descrição: Lista todas as vagas disponíveis baseadas no filtro
    - Response: Lista de `JobEntity`


## Contato

Pedro - [pedro.tx2001@gmail.com](mailto:pedro.tx2001@gmail.com)

LinkedIn: [Pedro Liu](https://www.linkedin.com/in/pedro-liu/)

---
