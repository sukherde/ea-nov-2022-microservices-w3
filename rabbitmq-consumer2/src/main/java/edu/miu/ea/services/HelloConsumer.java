package edu.miu.ea.services;

public interface HelloConsumer {
    void bindToHelloQueue(String payload);
}
