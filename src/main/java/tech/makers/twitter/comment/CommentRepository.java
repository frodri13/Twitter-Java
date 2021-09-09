package tech.makers.twitter.comment;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CommentRepository extends CrudRepository<Comment, Long> {
    List<Comment> findAll();
    Page<Comment> findByTweetId(Long tweetId, Pageable pageable);
    Optional<Comment> findByIdandTweetId(Long id, Long tweetid);
}
