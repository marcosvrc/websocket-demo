package br.com.websocket.simple.controller;


import br.com.websocket.simple.model.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;

import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

    @MessageMapping("/sendMessage") // envia mensagem para /app/sendMessage
    @SendTo("/topic/messages")      // resposta vai para /topic/messages
    public Message sendMessage(Message message) {

        return message; // simplesmente retorna a mensagem recebida
    }

}
