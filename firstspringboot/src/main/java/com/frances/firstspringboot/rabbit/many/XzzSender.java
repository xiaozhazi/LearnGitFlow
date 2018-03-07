package com.frances.firstspringboot.rabbit.many;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class XzzSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(int i) {
        String context = "spring boot xzz queue" + "*****" +i;
        System.out.println("Sender1 :" + context);
        this.rabbitTemplate.convertAndSend("xzz", context);
    }
}
