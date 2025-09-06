package br.com.websocket.simple.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class SimpleTextHandler extends TextWebSocketHandler {

    private static final Logger logger = LoggerFactory.getLogger(SimpleTextHandler.class);

    @Override
    protected void handleTextMessage(org.springframework.web.socket.WebSocketSession session,
                                     org.springframework.web.socket.TextMessage message) throws Exception {
        // apenas ecoa a mensagem recebida
        logger.info("Mensagem recebida: " + message.getPayload());

        for (int i = 1; i <= 5; i++) {
            Thread.sleep(2000); // 2 segundos de delay

            String resposta = "Mensagem #" + i + " após delay - recebido: " + message.getPayload();
            session.sendMessage(new TextMessage(resposta));
        }
    }
}
