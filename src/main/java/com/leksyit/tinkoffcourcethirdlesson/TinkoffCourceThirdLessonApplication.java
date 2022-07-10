package com.leksyit.tinkoffcourcethirdlesson;

import jdk.jfr.Event;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Scanner;

@SpringBootApplication
public class TinkoffCourceThirdLessonApplication {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String command = "";
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.leksyit.tinkoffcourcethirdlesson");
        DateService dateService = applicationContext.getBean(DateService.class);
        while (!command.equals("end")) {
            command = console.nextLine();
            Long currentDateLong = System.currentTimeMillis();
            dateService.getDate(command,currentDateLong);
        }
    }

}
