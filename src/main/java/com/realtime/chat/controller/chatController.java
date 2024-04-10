package com.realtime.chat.controller;

import com.realtime.chat.config.Msg;
import org.springframework.messaging.handler.annotation.MessageMapping;

import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class chatController {
    @MessageMapping("/chatmessage")
    @SendTo("/chat")
    public Msg sendMessage(Msg message){
        return message;
    }
}
