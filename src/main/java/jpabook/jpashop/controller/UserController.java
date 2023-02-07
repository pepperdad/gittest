package jpabook.jpashop.controller;

import jpabook.jpashop.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("mainpage")
    public String main() {
        return "index";
    }

    @GetMapping("login/index")
    public String login(Model model) {
        model.addAttribute("userForm", new UserForm());
        return "login/index";
    }

    @GetMapping("signin/index")
    public String register(Model model) {
        model.addAttribute("userForm", new UserForm());
        return "signin/index";
    }
}
