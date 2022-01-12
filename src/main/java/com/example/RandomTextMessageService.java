package com.example;


import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom;

@Component("messageService2")
public class RandomTextMessageService implements MessageService{
    private final String[] strings = {
            "wiadomosc 1",
            "wiadomosc 2",
            "wiadomosc 3",
            "wiadomosc 4",
            "wiadomosc 5",
            "wiadomosc 6",
            "wiadomosc 7",
            "wiadomosc 8",
            "wiadomosc 9",
            "wiadomosc 10",
    };
    @Override
    public String getMessage() {
        int randomNum = ThreadLocalRandom.current().nextInt(0, 10 + 1);
        return strings[randomNum];
    }
}
