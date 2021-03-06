package books;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class Book_app {

    public static void main(String[] args) {
        SpringApplication.run(Book_app.class, args);
    }

}