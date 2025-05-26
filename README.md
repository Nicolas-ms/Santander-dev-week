# Santander Dev Week - API

API RESTful desenvolvida em Java com Spring Boot para a Santander Dev Week. O projeto simula funcionalidades bancárias, como cadastro de usuários, contas, cartões, funcionalidades e notícias.

## Tecnologias Utilizadas
- **Java 17**
- **Spring Boot 3**
- **Spring Data JPA**
- **H2 Database (dev) / PostgreSQL (prod)**
- **OpenAPI/Swagger**
- **Gradle**

## Arquitetura
- **Camada de domínio**: Entidades JPA para User, Account, Card, Feature, News.
- **DTOs**: Exposição de dados desacoplada do modelo de domínio.
- **Service/Repository**: Regras de negócio e persistência.
- **Controller**: Endpoints RESTful.
- **Mapper**: Conversão entre entidades e DTOs.
- **Tratamento global de exceções**.

## Endpoints Principais

### Usuários
- `GET /users/{id}`: Busca usuário por ID.
- `POST /users`: Cria um novo usuário.

> **Obs:** Endpoints retornam e recebem DTOs, não entidades do domínio.

### Exemplo de Payload (UserDTO)
```json
{
  "name": "João Silva",
  "account": {
    "number": "12345-6",
    "agency": "0001",
    "balance": 1000.00,
    "limit": 500.00
  },
  "card": {
    "number": "5555-6666-7777-8888",
    "limit": 2000.00
  },
  "features": [
    { "icon": "pix", "description": "Transferências via Pix" }
  ],
  "news": [
    { "icon": "promo", "description": "Promoção de cashback" }
  ]
}
```

## Como Executar

1. **Clone o repositório:**
   ```bash
   git clone <repo-url>
   cd santander-dev-week
   ```
2. **Build e testes:**
   ```bash
   ./gradlew build
   ```
3. **Execute a aplicação:**
   ```bash
   ./gradlew bootRun
   ```
4. **Acesse a documentação Swagger:**
   - [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## Testes
- Testes automatizados podem ser executados com `./gradlew test`.

## Melhorias Recentes
- Uso de DTOs para segurança e flexibilidade.
- Refatoração do controller e criação de mappers.
- Estrutura pronta para expansão de endpoints e regras de negócio.

## Contribuição
Pull requests são bem-vindos! Sinta-se à vontade para propor melhorias, correções ou novas funcionalidades.

---
Projeto educacional, sem fins comerciais.
