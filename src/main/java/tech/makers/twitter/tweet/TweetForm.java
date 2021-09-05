package tech.makers.twitter.tweet;

public class TweetForm {
    private String body;

    protected  TweetForm() {}

    TweetForm(String body){
        this.body = body;
    }

    public String getBody() {
        return this.body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
