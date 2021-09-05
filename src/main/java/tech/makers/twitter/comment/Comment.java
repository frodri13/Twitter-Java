package tech.makers.twitter.comment;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

public class Comment {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String body;
    private LocalDateTime createdAt;
    private Long appUserId;
    private Long tweetId;

    protected Comment() {}

    public Comment(String body) {
        this.body = body;
    }

    public Comment(String body, LocalDateTime createdAt, Long appUserId, Long tweetId) {
        this.body = body;
        this.createdAt = createdAt;
        this.appUserId = appUserId;
        this.tweetId = tweetId;
    }

    public Long getId() {
        return id;
    }

    public String getBody() {
        return body;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public Long getAppUserId() {
        return appUserId;
    }

    public Long getTweetId() {
        return tweetId;
    }
}
