package edu.miu.ea.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloQueue {

    @Bean
    public Queue hiQueue1() {
        return new Queue("hello-queue-1", true);
    }

    @Bean
    public Queue hiQueue2() {
        return new Queue("hello-queue-2", true);
    }

    @Bean
    Binding helloQueue1Binding(Queue hiQueue1, FanoutExchange helloFanoutExchange) {
        return BindingBuilder.bind(hiQueue1).to(helloFanoutExchange);
    }

    @Bean
    Binding helloQueu2Binding(Queue hiQueue2, FanoutExchange helloFanoutExchange) {
        return BindingBuilder.bind(hiQueue2).to(helloFanoutExchange);
    }
}
