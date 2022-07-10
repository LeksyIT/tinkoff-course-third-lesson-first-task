package com.leksyit.tinkoffcourcethirdlesson;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;


@Component
public class CurrentDateImpl implements CurrentDate{

    private final SimpleDateFormat currentDate;

    public CurrentDateImpl(@Qualifier("currentDate") SimpleDateFormat currentDate) {
        this.currentDate = currentDate;
    }

    @Override
    public String getCurrentDate(Long date) {
        return currentDate.format(date);
    }
}
