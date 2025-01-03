# API Web - Documentação

## Visão Geral

Este projeto é uma API web desenvolvida com várias tecnologias modernas para garantir segurança, escalabilidade e manutenibilidade. Utilizamos **Java 21** com **Spring Boot** e uma arquitetura limpa (**Clean Architecture**) para organizar o código de forma eficiente. A segurança é garantida pelo uso de **JWT** (JSON Web Tokens) e **Spring Security**. A aplicação é contêinerizada com **Docker** e utiliza **Apache Kafka** para mensageria, além de **Eureka Server** para descoberta de serviços em uma arquitetura de microserviços. Os dados são armazenados em **MariaDB** e a documentação da API é gerada com **Swagger**. Testes unitários são realizados para garantir a qualidade do código. As funcionalidades da API incluem gerenciamento de usuários, itens, carrinho e favoritos.

## Tecnologias Utilizadas

- **Java 21**
- **Spring Boot**
- **JWT (JSON Web Tokens)**
- **Clean Architecture**
- **Docker**
- **Apache Kafka**
- **Eureka Server**
- **Spring Security**
- **Microservices**
- **Testes Unitários**
- **MariaDB**
- **Swagger**
- **Postman**

## Funcionalidades

- **Users (Usuários)**
  - Criação, atualização, remoção e listagem de usuários.
  - Autenticação e autorização de usuários utilizando JWT e Spring Security.
  
- **Itens**
  - CRUD (Create, Read, Update, Delete) de itens.
  - Listagem de itens disponíveis.

- **Carrinho**
  - Adição e remoção de itens no carrinho.
  - Visualização do carrinho de compras do usuário.

- **Favoritos**
  - Adição e remoção de itens aos favoritos.
  - Listagem de itens favoritos do usuário.

## Estrutura do Projeto

A estrutura do projeto segue os princípios da Clean Architecture, separando responsabilidades em diferentes camadas:

- **Domain**: Contém entidades e interfaces dos repositórios.
- **UseCases**: Contém a lógica de negócio e os casos de uso.
- **Adapters**: Contém os adaptadores que fazem a ponte entre a aplicação e o mundo externo (ex: controladores REST, adaptadores de banco de dados).
- **Frameworks & Drivers**: Contém as implementações específicas de frameworks e drivers (ex: Spring Data, Spring Security).

## Instalação e Execução

### Pré-requisitos

- **Docker** e **Docker Compose**
- **Java 21**
- **Maven**

### Passos

1. Clone o repositório:
    ```bash
    git clone https://github.com/seu-usuario/seu-repositorio.git
    cd seu-repositorio
    ```

2. Compile e construa o projeto com Maven:
    ```bash
    mvn clean install
    ```

3. Inicie os contêineres Docker:
    ```bash
    docker-compose up --build
    ```

4. Acesse a documentação Swagger da API em:
    ```
    http://localhost:8080/swagger-ui.html
    ```

## Testes

Para executar os testes unitários, utilize o comando:
```bash
mvn test
```

## Utilização com Postman

Os endpoints da API podem ser testados utilizando o Postman. Importe a coleção Postman disponível no repositório para facilitar os testes.

## Contribuição

Contribuições são bem-vindas! Por favor, siga os passos abaixo para contribuir:

1. Fork o projeto.
2. Crie uma branch com a nova funcionalidade (`git checkout -b nova-funcionalidade`).
3. Commit suas mudanças (`git commit -am 'Adiciona nova funcionalidade'`).
4. Push para a branch (`git push origin nova-funcionalidade`).
5. Abra um Pull Request.

## Licença

Este projeto está licenciado sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.

## Contato

Para mais informações, entre em contato com joao.madeirodev@gmail.com
