package main;

import main.model.*;
import main.services.ArtPieceService;
import main.utils.StaticDB;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

// Inspired in: https://spring.io/guides/gs/spring-boot/

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx, UserRepository users,
                                               ArtPieceRepository artPieces, ImageRepository images, KeywordRepository keywords) {
        return args -> {

            StaticDB.addUsers(users);
            StaticDB.addArtPieces(artPieces);
            StaticDB.addImages(images);
            StaticDB.addKeywords(keywords);

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }
        };
    }

}
