package edu.miu.ea.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQTopicConfig {
    @Bean
    Queue marketingTopicQueue() {
        return new Queue("marketingQueue", false);
    }

    @Bean
    Queue financeTopicQueue() {
        return new Queue("financeQueue", false);
    }

    @Bean
    Queue adminTopicQueue() {
        return new Queue("adminQueue", false);
    }

    @Bean
    Queue allTopicQueue() {
        return new Queue("allTopicQueue", false);
    }

    @Bean
    TopicExchange exchangeTopic() {
        return new TopicExchange("topic-exchange");
    }

    @Bean
    Binding marketingTopicBinding(Queue marketingTopicQueue, TopicExchange exchangeTopic) {
        return BindingBuilder.bind(marketingTopicQueue).to(exchangeTopic).with("queue.marketing");
    }

    @Bean
    Binding financeTopicBinding(Queue financeTopicQueue, TopicExchange exchangeTopic) {
        return BindingBuilder.bind(financeTopicQueue).to(exchangeTopic).with("queue.finance");
    }

    @Bean
    Binding adminTopicBinding(Queue adminTopicQueue, TopicExchange exchangeTopic) {
        return BindingBuilder.bind(adminTopicQueue).to(exchangeTopic).with("queue.admin");
    }

    @Bean
    Binding allTopicBinding(Queue allTopicQueue, TopicExchange exchangeTopic) {
        return BindingBuilder.bind(allTopicQueue).to(exchangeTopic).with("queue.*");
    }

}
