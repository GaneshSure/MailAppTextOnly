package com.practice.mail;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx= new ClassPathXmlApplicationContext("spring-config.xml");
        Object o=ctx.getBean("id2");
        TestBean tb=(TestBean)o;
//        TestBean tb=(TestBean)ctx.getBean("id2");
        tb.sendEmail();
    	
    }
}
