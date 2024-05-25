
package com.ideas.aplicacion.service;

import java.util.Properties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;


public class EmailServiceImpl {
    
   @Autowired
   private JavaMailSender emailSender;
    
   public void sendMail(String to, String subject, String text){
      
       SimpleMailMessage mailMessage = new SimpleMailMessage();
       mailMessage.setFrom("andres00fonseca@gmail.com");
       mailMessage.setTo(to);
       mailMessage.setSubject(subject);
       mailMessage.setText(text);
       
       emailSender.send(mailMessage);
   }
   
   @Bean
    public JavaMailSender getJavaMailSender() {
    JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
    mailSender.setHost("smtp.gmail.com");
    mailSender.setPort(587);
    
    mailSender.setUsername("andres00fonseca@gmail.com");
    mailSender.setPassword("wjdevyzkhqamzpbc");
    
    Properties props = mailSender.getJavaMailProperties();
    props.put("mail.transport.protocol", "smtp");
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.starttls.enable", "true");
    props.put("mail.debug", "true");
    
    return mailSender;
    }
    
    @Bean
    public SimpleMailMessage templateSimpleMessage() {
    SimpleMailMessage message = new SimpleMailMessage();
    message.setText(
      "This is the test email template for your email:\n%s\n");
    return message;
}
    
    
    

}
