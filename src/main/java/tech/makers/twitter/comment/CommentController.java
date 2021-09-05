package tech.makers.twitter.comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CommentController {

    @Autowired
    CommentService commentService;

    @PostMapping("/comments")
    public String create(@ModelAttribute CommentForm commentForm){

        Comment newComment = commentService.create(commentForm.getBody());
        commentService.save(newComment);
        return "redirect:/";
    }
}
