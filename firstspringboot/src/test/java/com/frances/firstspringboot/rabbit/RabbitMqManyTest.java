package com.frances.firstspringboot.rabbit;

import com.frances.firstspringboot.rabbit.many.XzzSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMqManyTest {
    @Autowired
    private XzzSender xzzSender;

    @Autowired
    private XzzSender xzzSender2;

    @Test
    public void oneToMany() throws Exception{
        for(int i = 0; i < 100; i++){
            xzzSender.send(i);
        }
    }

    @Test
    public void manyToMany() throws Exception{
        for(int i = 0; i < 100; i++){
            xzzSender.send(i);
            xzzSender2.send(i);
        }
    }
}
