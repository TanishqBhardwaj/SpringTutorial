package com.example.springbootdemo.controller;

import com.example.springbootdemo.model.Message;
import com.example.springbootdemo.model.MessageResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {

    @MessageMapping("/user")
    @SendTo("/topic/user")
    public MessageResponse getMessage(Message message) {
        return new MessageResponse("Hello, " + message.getName());
    }
}
