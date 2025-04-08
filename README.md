# Loja Online - Microserviços

Sistema de e-commerce construído com arquitetura de microserviços usando Spring Boot, Kafka, e MariaDB.

## 🚀 Tecnologias

- Java 17
- Spring Boot 3.x
- Spring Cloud
- Apache Kafka
- MariaDB
- Docker & Docker Compose
- Maven

## 📋 Pré-requisitos

- Docker e Docker Compose
- Java 17
- Maven
- Git

## 🔧 Instalação Local

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/loja-online.git
cd loja-online
```

2. Configure as variáveis de ambiente:
```bash
cp .env.example .env
# Edite o arquivo .env com suas configurações
```

3. Inicie os serviços:
```bash
docker-compose up -d
```

## 🌐 Deploy

### Railway.app (Recomendado para Demo)

1. Crie uma conta no [Railway.app](https://railway.app)
2. Conecte seu repositório GitHub
3. Configure as variáveis de ambiente:
   - DB_USER
   - DB_PASSWORD
   - DB_ROOT_PASSWORD
4. Deploy automático será iniciado

### Render.com (Alternativa)

1. Crie uma conta no [Render.com](https://render.com)
2. Conecte seu repositório GitHub
3. Crie um novo Web Service
4. Configure as variáveis de ambiente
5. Deploy automático será iniciado

## 📊 Endpoints

- User Service: `http://localhost:8081`
- Item Service: `http://localhost:8080`
- Kafka: `localhost:9092`
- MariaDB: `localhost:3307`

## 🔍 Monitoramento

- Health Checks: `/actuator/health`
- Métricas: `/actuator/metrics`
- Info: `/actuator/info`

## 📝 Documentação da API

A documentação Swagger está disponível em:
- User Service: `http://localhost:8081/swagger-ui.html`
- Item Service: `http://localhost:8080/swagger-ui.html`

## 🤝 Contribuindo

1. Fork o projeto
2. Crie sua Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. Push para a Branch (`git push origin feature/AmazingFeature`)
5. Abra um Pull Request

## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## 👥 Autores

- Seu Nome - [LinkedIn](https://www.linkedin.com/in/seu-perfil/)

## 🙏 Agradecimentos

- Spring Boot Team
- Apache Kafka Team
- MariaDB Team
- Docker Team
