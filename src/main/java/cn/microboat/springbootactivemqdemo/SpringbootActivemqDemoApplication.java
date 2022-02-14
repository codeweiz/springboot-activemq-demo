package cn.microboat.springbootactivemqdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringbootActivemqDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootActivemqDemoApplication.class, args);
    }

}
