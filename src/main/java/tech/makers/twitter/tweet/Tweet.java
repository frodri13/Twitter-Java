package tech.makers.twitter.tweet;


import org.springframework.beans.factory.annotation.Autowired;
import tech.makers.twitter.time.TweetTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


// This is a Spring Entity.
// It represents a Model in MVC.
// And each instance, when saved, will refer to a row in the 'tweet' table in the database.
@Entity
public class Tweet {
    private TweetTime tweetTime;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String body;
    private String time;

    protected Tweet() {}

    public Tweet(String body) {
        this.body = body;
    }

    @Autowired
    public Tweet(String body, TweetTime tweetTime) {
        this.body = body;
        time = tweetTime.getTime();
    }

    @Override
    public String toString() {
        return String.format("Tweet[id=%d, body='%s']", id, body);
    }

    public Long getId() {
        return id;
    }

    public String getBody() {
        return body;
    }

    public String getTime() {return time;}
}
