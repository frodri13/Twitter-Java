package tech.makers.twitter.comment;

public class CommentForm {
    private String body;

    public CommentForm() {}

    CommentForm(String body){
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
