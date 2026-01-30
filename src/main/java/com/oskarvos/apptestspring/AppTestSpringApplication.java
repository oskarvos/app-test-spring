package com.oskarvos.apptestspring;

import com.oskarvos.apptestspring.model.Computer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AppTestSpringApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(AppTestSpringApplication.class, args);

        Computer computer = context.getBean(Computer.class);
        computer.start();
    }

}
