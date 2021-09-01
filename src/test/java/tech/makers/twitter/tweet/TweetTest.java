package tech.makers.twitter.tweet;

import org.junit.jupiter.api.Test;
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
        assertEquals(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")) , subject.getTime());
    }

    @Test
    void testToString() {
        Tweet subject = new Tweet("Hello, world!");
        assertEquals("Tweet[id=null, body='Hello, world!', time='" + LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")) + "']", subject.toString());
    }
}
