package edu.miu.ea.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties("example")
@Getter
@Setter
public class MyConfig {
    private String username;
    private String password;
}
