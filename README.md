# websocket-demo

Este repositório contém dois projetos de exemplo utilizando WebSocket com Spring Boot:

- **websocket-chat**: Aplicação de chat em tempo real usando WebSocket e STOMP.
- **websocket-simple**: Exemplo simples de comunicação WebSocket.


## Estrutura dos Projetos

```text
websocket-demo/
├── websocket-chat/
│   └── src/main/java/br/com/websocket/chat/
│       ├── WebsocketChatApplication.java
│       ├── config/WebSocketConfig.java
│       ├── controller/ChatController.java
│       ├── event/WebSocketEventListener.java
│       └── model/Message.java, MessageType.java
│   └── src/main/resources/static/index.html
│   └── src/main/resources/application.properties
│   └── pom.xml
├── websocket-simple/
│   └── src/main/java/br/com/websocket/simple/
│       ├── WebsocketSimpleApplication.java
│       ├── config/WebSocketConfig.java, SimpleTextHandler.java
│       ├── controller/WebSocketController.java
│       └── model/Message.java
│   └── src/main/resources/application.properties
│   └── pom.xml
```

## Detalhes dos Projetos


### websocket-chat

- **Descrição:** Chat em tempo real usando WebSocket, STOMP e SockJS.

- **Principais arquivos:**
		- `WebsocketChatApplication.java`: Classe principal Spring Boot.
		- `WebSocketConfig.java`: Configuração do WebSocket/STOMP.
		- `ChatController.java`: Controller para envio/recebimento de mensagens.
		- `WebSocketEventListener.java`: Listener de eventos de conexão.
		- `Message.java`, `MessageType.java`: Modelos de mensagem.
		- `index.html`: Interface web do chat.

- **Arquitetura:**
		- Backend em Spring Boot, frontend simples em HTML/JS.
		- Utiliza tópicos para broadcast de mensagens.


### websocket-simple

- **Descrição:** Exemplo básico de WebSocket, sem STOMP.

- **Principais arquivos:**
		- `WebsocketSimpleApplication.java`: Classe principal Spring Boot.
		- `WebSocketConfig.java`: Configuração do WebSocket.
		- `SimpleTextHandler.java`: Manipulador de mensagens WebSocket.
		- `WebSocketController.java`: Controller REST para testes.
		- `Message.java`: Modelo de mensagem.

- **Arquitetura:**
		- Backend em Spring Boot.
		- Comunicação direta via WebSocket.

## Como Executar

### Pré-requisitos
- Java 17+
- Maven


### Executando websocket-chat

```bash
cd websocket-chat
mvn spring-boot:run
```

Acesse [http://localhost:8085](http://localhost:8085) para abrir o chat.

### Executando websocket-simple

```bash
cd websocket-simple
mvn spring-boot:run
```

O WebSocket estará disponível em `ws://localhost:8083/ws-chat`.

Obs.: Use o Postman para testes conforme imagem abaixo:

![Postman executando websocket](https://github.com/marcosvrc/websocket-demo/blob/master/Postman%20-%20Teste%20Websocket.png)

## Referências
- [Spring WebSocket](https://spring.io/guides/gs/messaging-stomp-websocket/)
- [Documentação oficial do Spring Boot](https://spring.io/projects/spring-boot)
