package edu.miu.ea;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class RabbitmqPublisherApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitmqPublisherApplication.class, args);
    }

    // @Bean
    // ApplicationRunner runner(ConnectionFactory cf) {
    // return args -> {
    // boolean open = false;
    // while (!open) {
    // try {
    // cf.createConnection().close();
    // open = true;
    // } catch (Exception e) {
    // Thread.sleep(5000);
    // }
    // }
    // };
    // }
}
