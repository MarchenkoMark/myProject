package com.BookServer2.myProject;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(BookRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Book("Java Core", "Core Java, Eleventh Edition, is the definitive guide to writing robust, maintainable code.", 50, "https://eloquentjavascript.net", "/assets/img/java.jpg")));
            log.info("Preloading " + repository.save(new Book("FEYNMAN", "Legendary lectures", 20, "https://www.google.com.ua/?hl=ru", "/assets/img/feynman.jpg")));
            log.info("Preloading " + repository.save(new Book("HAWKING", "Everything about time", 35, "https://www.google.com.ua/?hl=ru", "/assets/img/hoking.jpg")));
            log.info("Preloading " + repository.save(new Book("LANDAU", "Best formulae book", 10, "https://www.google.com.ua/?hl=ru", "/assets/img/landau.jpg")));
            log.info("Preloading " + repository.save(new Book("ELOQUENT JAVASCRIPT", "Legendary lectures", 0, "https://www.google.com.ua/?hl=ru", "/assets/img/javascript.jpg")));
        };
    }
}
