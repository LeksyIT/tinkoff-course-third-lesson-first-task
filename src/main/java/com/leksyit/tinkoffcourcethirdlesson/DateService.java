package com.leksyit.tinkoffcourcethirdlesson;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DateService {
    private final CurrentDate currentDate;
    private final CurrentDateIso currentDateIso;

    public void getDate(String dateFormat, Long date) {
        if ("today".equals(dateFormat)) {
            System.out.println(currentDate.getCurrentDate(date));
        } else if ("today-iso".equals(dateFormat)) {
            System.out.println(currentDateIso.getCurrentDateIso(date));
        } else {
            System.out.println("Введена неверная команда");
        }
    }
}
