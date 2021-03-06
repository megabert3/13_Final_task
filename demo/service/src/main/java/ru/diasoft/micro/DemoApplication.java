package ru.diasoft.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableDiscoveryClient
@EnableEurekaClient
@EnableCaching
@EnableJpaRepositories()
@EntityScan()
@SpringBootApplication()
public class DemoApplication {

    @SuppressWarnings({"java:S1148", "Diasoft-Java-Custom:FindReflectionCheck"})
    public static void main(String[] args) {
        try {
            SpringApplication.run(DemoApplication.class, args);
        } catch (RuntimeException ex) {
            if (!ex.getClass().getSimpleName().contains("SilentExitException")) {
                ex.printStackTrace();
            }
            throw ex;
        }
    }

}
