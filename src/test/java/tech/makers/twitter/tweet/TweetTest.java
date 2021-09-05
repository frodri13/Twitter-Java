package tech.makers.twitter.tweet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tech.makers.twitter.tweet.Tweet;

import java.time.*;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TweetTest {

    @Test
    void testConstructs() {
        LocalDateTime date = LocalDateTime.now();

        Tweet subject = new Tweet("Hello, world!", date);
        assertEquals("Hello, world!", subject.getBody());
        assertEquals(null, subject.getId());
        assertEquals(date , subject.getCreatedAt());
    }

    @Test
    void testToString() {
        LocalDateTime date = LocalDateTime.now();

        Tweet subject = new Tweet("Hello, world!", date);
        assertEquals("Tweet[id=null, body='Hello, world!', createdAt='"+ date +"']", subject.toString());
    }
}
