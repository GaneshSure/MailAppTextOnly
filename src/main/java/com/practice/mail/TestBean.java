package com.practice.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class TestBean {
	
	private JavaMailSenderImpl mailSender;

	public void setMailSender(JavaMailSenderImpl mailSender) {
		this.mailSender = mailSender;
	}
	
	public void sendEmail() {
		
		try {
			SimpleMailMessage smm= new SimpleMailMessage();
			smm.setTo("sure.ganeshreddy@gamil.com");
			smm.setSubject("send only text... ");
			smm.setText("This is example describe about sending a mail with only text ");
			mailSender.send(smm);
			System.out.println("mail send successfully");
		} catch (MailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
