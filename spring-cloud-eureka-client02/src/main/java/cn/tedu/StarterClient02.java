package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class StarterClient02 {
    public static void main( String[] args ) {
        SpringApplication.run(StarterClient02.class,args);
        System.out.println( "Hello World!" );
    }
}
