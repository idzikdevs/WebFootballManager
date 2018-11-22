package pl.idzikdev.webfootballmanager.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    //@RequestMapping(value = "/",method = RequestMethod.GET)
    public String home(Model model){
        String hello="Hello world!";
        model.addAttribute("hello",hello);
        return "index";
    }
}

