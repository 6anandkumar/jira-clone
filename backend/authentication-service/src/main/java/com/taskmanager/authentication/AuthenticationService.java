package com.taskmanager.authentication;

import com.taskmanager.common.TestCommonLib;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * Hello world!
 *
 */
@SpringBootApplication
public class AuthenticationService
{
    public static void main( String[] args )
    {
        TestCommonLib testCommonLib = new TestCommonLib();
        System.out.println( "Hello World!" );
        SpringApplication.run(AuthenticationService.class, args);
    }
}
