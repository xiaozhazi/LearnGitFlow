package com.frances.firstspringboot.rabbit.many;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "xzz")
public class XzzReceiver2 {
    @RabbitHandler
    public void process(String xzz) {
        System.out.println("Receiver 2 :" + xzz);
    }
}
