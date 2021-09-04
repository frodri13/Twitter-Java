package tech.makers.twitter.appuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppUserController {

    @Autowired
    private AppUserService appUserService;

    @GetMapping("/sign-up")
    public String signUp(Model model){

        model.addAttribute("newUser", new AppUser());

        return "signUp";
    }

    @PostMapping("/users")
    public String create(@ModelAttribute AppUserForm appUserForm){

        AppUser newAppUser = appUserService.create(appUserForm);
        appUserService.save(newAppUser);
        return "redirect:/";
    }

}