package tech.makers.twitter.comment;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CommentRepository extends CrudRepository {
    List<Comment> findAll();
}
