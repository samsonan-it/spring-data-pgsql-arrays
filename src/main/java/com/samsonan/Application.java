package com.samsonan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @Bean
    public CommandLineRunner demo(LogicRepository repository) {
        return (args) -> {

            Float[] floatLogicParams = {0.1f, 1.2f, 3.0f, -2.7f};

            Logic sampleLogic = new Logic();
            sampleLogic.setFloatParams(floatLogicParams);

            repository.save(sampleLogic);

            log.info("Logic :: findAll():");
            log.info("-------------------------------");
            for (Logic logic : repository.findAll()) {
                log.info(logic.toString());
            }
            log.info("");
        };
    }

}
