package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) { // model에 data를 넣어 view로 보낼 수 있음
        model.addAttribute("data", "hello!!"); // data라는 키에 hello!!라는 값 넘김
        return "hello"; // hello라는 이름의 view로 넘김
    }
}
