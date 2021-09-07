package tech.makers.twitter.tweet;

import javax.persistence.*;
import java.time.LocalDateTime;

// This is a Spring Entity.
//Entities should have no logic, only storage data
// It represents a Model in MVC.
// And each instance, when saved, will refer to a row in the 'tweet' table in the database.
@Entity
public class Tweet {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String body;
    private LocalDateTime createdAt;

    protected Tweet() {}

    public Tweet(String body) {
        this.body = body;
    }
    public Tweet(String body, LocalDateTime createdAt){
        this.body = body;
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return String.format("Tweet[id=%d, body='%s', createdAt='%s']", id, body, createdAt);
    }

    public Long getId() {
        return id;
    }

    public String getBody() {
        return body;
    }

    public LocalDateTime getCreatedAt() { return LocalDateTime.now();
    }
}
