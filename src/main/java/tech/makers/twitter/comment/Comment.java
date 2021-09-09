package tech.makers.twitter.comment;

import tech.makers.twitter.tweet.Tweet;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String body;
    private LocalDateTime createdAt;
    private Long appUserId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tweet")
    private Tweet tweet;

    protected Comment() {}

    public Comment(String body) {
        this.body = body;
    }

    public Comment(String body, LocalDateTime createdAt) {
        this.body = body;
        this.createdAt = createdAt;
    }

    public Comment(String body, LocalDateTime createdAt, Long appUserId, Tweet tweet) {
        this.body = body;
        this.createdAt = createdAt;
        this.appUserId = appUserId;
        this.tweet = tweet;
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

    public Tweet getTweet() {
        return tweet;
    }

    public void setTweet(Tweet tweet) {
        this.tweet = tweet;
    }
}
