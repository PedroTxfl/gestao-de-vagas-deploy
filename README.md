# Gerenciamento de Vagas de Trabalho

Bem-vindo ao repositório do projeto **Gerenciamento de Vagas de Trabalho**. Este projeto foi desenvolvido para gerenciar vagas de trabalho, candidaturas e autenticação de candidatos e empresas.

## Índice

- [Visão Geral](#visão-geral)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
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
- Deploy com Railway


## Uso

Você pode acessar a documentação da API via Swagger em:

https://gestao-de-vagas-deploy-production.up.railway.app/swagger-ui/index.html

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
