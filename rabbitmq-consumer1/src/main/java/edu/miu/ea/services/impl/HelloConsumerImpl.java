package edu.miu.ea.services.impl;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import edu.miu.ea.services.HelloConsumer;

@Service
public class HelloConsumerImpl implements HelloConsumer {

    @Override
    @RabbitListener(queues = { "hello-queue-1" })
    public void bindToHelloQueue(String payload) {
        System.out.println(payload);
    }

    @Override
    @RabbitListener(queues = { "adminQueue" })
    public void bindToAdminQueue(String payload) {
        System.out.println(payload);
    }

}
