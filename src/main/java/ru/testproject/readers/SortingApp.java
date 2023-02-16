package ru.testproject.readers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SortingApp {


    public static void main(String[] args) throws Exception {

        ConfigurableApplicationContext context = SpringApplication.run(SortingApp.class, args);

        SortingMultipartFiles main = context.getBean(SortingMultipartFiles.class);

        ParsingArgs parsingArgs = context.getBean(ParsingArgs.class);
        try {
            switch (parsingArgs.getArgs()[1]) {
                case ("-i") -> {
                    main.sortingIntegerFiles();
                }
                case ("-s") -> {
                    main.sortingStringFiles();
                }
            }

        } catch (NumberFormatException e) {
            System.out.println("Illegal format of data for sorting Integer values, please, check files");
        }
    }

}
