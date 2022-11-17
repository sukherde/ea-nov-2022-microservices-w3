package edu.miu.ea;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class RabbitmqConsumerApplication1 {
    public static void main(String[] args) {
        SpringApplication.run(RabbitmqConsumerApplication1.class, args);
    }
}
