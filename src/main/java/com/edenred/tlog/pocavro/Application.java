package com.edenred.tlog.pocavro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.schema.client.EnableSchemaRegistryClient;

@SpringBootApplication
@EnableSchemaRegistryClient
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
