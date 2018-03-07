package com.frances.firstspringboot.rabbit;

import com.frances.firstspringboot.model.User;
import com.frances.firstspringboot.rabbit.object.ObjectSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestMapping;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMqObjectTest {
    @Autowired
    private ObjectSender objectSender;

    @Test
    public void sendObject() throws Exception{
        User user = new User();
        user.setName("xzz");
        user.setPass("123456");
        objectSender.send(user);
    }
}
