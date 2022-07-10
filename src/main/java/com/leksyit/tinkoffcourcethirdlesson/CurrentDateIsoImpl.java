package com.leksyit.tinkoffcourcethirdlesson;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

@Component
public class CurrentDateIsoImpl implements CurrentDateIso{

    private final SimpleDateFormat currentIsoDate;

    public CurrentDateIsoImpl(@Qualifier("currentIsoDate") SimpleDateFormat currentIsoDate) {
        this.currentIsoDate = currentIsoDate;
    }
    @Override
    public String getCurrentDateIso(Long date) {
        return currentIsoDate.format(date);
    }
}
