package tech.makers.twitter.tweet;

import org.junit.jupiter.api.Test;
import tech.makers.twitter.time.TweetTime;
import tech.makers.twitter.tweet.Tweet;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TweetTest {
    @Test
    void testConstructs() {
        Tweet subject = new Tweet("Hello, world!");
        assertEquals("Hello, world!", subject.getBody());
        assertEquals(null, subject.getId());
    }

    @Test
    void testToString() {
        Tweet subject = new Tweet("Hello, world!");
        assertEquals("Tweet[id=null, body='Hello, world!']", subject.toString());
    }

    @Test
    void shouldShowTheTime() {
        Tweet subject = new Tweet("And the time is: ", new TweetTime());
        assertEquals(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")), subject.getTime());
    }
}
