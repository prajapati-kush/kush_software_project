package com.internship;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@EnableAutoConfiguration
public class App
{
    public static void main( String[] args )
    {
        SpringApplication sp = new SpringApplication(App.class);
        sp.run();
        System.out.println( "Hello World!" );
    }
}