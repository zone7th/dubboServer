package com.semsun.dubbo.dubboServer;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class ServerApp 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    	applicationContext.start();
        System.out.println( "Hello World!" );
        
        try {
        	System.in.read();
        } catch (IOException e) {
        	e.printStackTrace();
        }
    }
}
