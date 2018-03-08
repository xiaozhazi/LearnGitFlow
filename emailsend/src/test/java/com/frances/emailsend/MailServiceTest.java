package com.frances.emailsend;

import com.frances.emailsend.service.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailServiceTest {

    @Autowired
    private MailService mailService;

    @Test
    public void testSimpleMail() throws Exception{
        mailService.sendSimpleMail("xiaozhazi@163.com","test simple mail",
                "hello, this is auto-send mail.");
    }

    @Test
    public void testHtmlMail() throws Exception{
        String content="<html>\n" +
                "<body>\n" +
                "    <h3> hello world ! this is a html email! </h3>" +
                "</body>\n" +
                "<html>";
        mailService.sendHtmlMail("xiaozhazi@163.com","test html mail", content);
    }

    @Test
    public void testAttachmentMail() throws Exception{
        String filePath = "/home/hudanqi/SpringBoot/LearnGitFlow/README.md";
        mailService.sendAttachmentMail("xiaozhazi@163.com","test attachment mail","include attachment",filePath);
    }

    @Test
    public void testInlineResouceMail(){
        String rscId = "xzz0006";
        String content = "<html><body> this is a mail included image:<img src=\'cid:" + rscId +"\'></body></html>";
        String imgPath = "/home/hudanqi/Pictures/1.png";

        mailService.sendInlineResourceMail("xiaozhazi@163.com","test inline resouce mail",content,imgPath,rscId);
    }
}
