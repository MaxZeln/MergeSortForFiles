package ru.testproject.readers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Array;
import java.util.ArrayList;

@SpringBootApplication
public class SortingApp {

    public static void main(String[] args) throws Exception {

        SpringApplication.run(SortingApp.class, args);

        String[] inputArgs;

        switch (args[0]) {

            case ("-a"), ("-d") -> {
                inputArgs = new String[args.length];
                inputArgs[0] = args[0];
                inputArgs[1] = args[1];
                for (int i = 2; i < args.length; i++) {
                    inputArgs[i] = args[i];
                }
            }
            default -> {
                inputArgs = new String[args.length + 1];
                inputArgs[0] = "-a";
                inputArgs[1] = args[0];
                for (int i = 1; i < args.length; i++) {
                    inputArgs[i + 1] = args[i];
                }
            }
        }
        System.out.println("Входящие параметры");
        for (String input : inputArgs) {

            System.out.println(input);
        }

    }
}
