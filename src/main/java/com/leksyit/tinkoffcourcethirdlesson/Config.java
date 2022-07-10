package com.leksyit.tinkoffcourcethirdlesson;

import org.springframework.context.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Locale;

@Configuration
public class Config {

    @Bean(name = "currentIsoDate")
    @Profile("en")
    @Scope("prototype")
    public SimpleDateFormat currentIsoDateEn() {
        return new SimpleDateFormat("EEEE, MMMM, d, yyyy", Locale.ENGLISH);
    }

    @Bean(name = "currentIsoDate")
    @Profile("ru")
    @Scope("prototype")
    public SimpleDateFormat currentIsoDateRu() {
        return new SimpleDateFormat("EEEE, MMMM, d, yyyy", Locale.forLanguageTag("ru"));
    }

    @Bean(name = "currentDate")
    @Scope("prototype")
    public SimpleDateFormat currentDate() {
        return new SimpleDateFormat("yyyy-MM-dd");
    }
}
