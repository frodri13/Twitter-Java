package tech.makers.twitter.comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.makers.twitter.tweet.IClockService;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private IClockService clockService;

    public List<Comment> findAll(){
        return commentRepository.findAll();
    }

    public Comment create(String body){
        return new Comment(body, LocalDateTime.now(clockService.getClock()));
    }

    public void save(Comment comment) {
        commentRepository.save(comment);
    }
}
