package tech.makers.twitter;

import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Component
public class TweetTime {
    private LocalTime time;
    private String formattedTime;

    public TweetTime(){
        this.time = LocalTime.now();
    }

    String formatting() {
     formattedTime = time.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        return null;
    }

    public String getTime() {
        formatting();
        return formattedTime;
    }
}
