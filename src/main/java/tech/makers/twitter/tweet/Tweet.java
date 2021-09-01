package tech.makers.twitter.tweet;


import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


// This is a Spring Entity.
// It represents a Model in MVC.
// And each instance, when saved, will refer to a row in the 'tweet' table in the database.
@Entity
public class Tweet {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String body;
    private String time;

    protected Tweet() {}

    @Autowired
    public Tweet(String body) {
        this.body = body;
        time = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")) ;
    }

    @Override
    public String toString() {
        return String.format("Tweet[id=%d, body='%s', time='%s']", id, body, time);
    }

    public Long getId() {
        return id;
    }

    public String getBody() {
        return body;
    }

    public String getTime() {
        return time;
    }
}
