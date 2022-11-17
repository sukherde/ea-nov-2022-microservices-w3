package edu.miu.ea;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import edu.miu.ea.config.MyConfig;

@SpringBootApplication
@EnableConfigurationProperties(MyConfig.class)
public class VaultConfigApplication implements CommandLineRunner {

    private final MyConfig myConfig;

    public VaultConfigApplication(MyConfig myConfig) {
        this.myConfig = myConfig;
    }

    public static void main(String[] args) {
        SpringApplication.run(VaultConfigApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(myConfig.getUsername());
        System.out.println(myConfig.getPassword());
    }
}
