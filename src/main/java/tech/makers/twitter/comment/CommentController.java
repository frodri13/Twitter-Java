package tech.makers.twitter.comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping("/comments")
    public String index(Model model){

        model.addAttribute("newComment", new CommentForm());
        model.addAttribute("comments", commentService.findAll());

        return "comments";
    }

    @PostMapping("/comments")
    public String create(@ModelAttribute CommentForm commentForm){

        Comment newComment = commentService.create(commentForm.getBody());
        commentService.save(newComment);
        return "redirect:/";
    }
}
