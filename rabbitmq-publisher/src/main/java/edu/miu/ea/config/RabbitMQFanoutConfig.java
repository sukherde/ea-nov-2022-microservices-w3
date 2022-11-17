package edu.miu.ea.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQFanoutConfig {

    @Bean
    Queue marketingFanoutQueue() {
        return new Queue("marketingQueue", false);
    }

    @Bean
    Queue financeFanoutQueue() {
        return new Queue("financeQueue", false);
    }

    @Bean
    Queue adminFanoutQueue() {
        return new Queue("adminQueue", false);
    }

    @Bean
    FanoutExchange exchangeFanout() {
        return new FanoutExchange("fanout-exchange");
    }

    @Bean
    Binding bindingFanoutMarketing(Queue marketingFanoutQueue, FanoutExchange exchangeFanout) {
        return BindingBuilder.bind(marketingFanoutQueue).to(exchangeFanout);
    }

    @Bean
    Binding bindingFanoutFinance(Queue financeFanoutQueue, FanoutExchange exchangeFanout) {
        return BindingBuilder.bind(financeFanoutQueue).to(exchangeFanout);

    }

    @Bean
    Binding bindingFanoutAdmin(Queue adminFanoutQueue, FanoutExchange exchangeFanout) {
        return BindingBuilder.bind(adminFanoutQueue).to(exchangeFanout);
    }

}
