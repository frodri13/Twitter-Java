package tech.makers.twitter.time;

import org.junit.jupiter.api.Test;
import tech.makers.twitter.time.TweetTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TweetTimeTest {
    @Test
    void itShouldReturnFormattedTime() {
        TweetTime subject = new TweetTime();

        assertEquals(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")), subject.getTime());
    }
}
