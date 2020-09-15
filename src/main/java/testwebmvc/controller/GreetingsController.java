package testwebmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingsController {
    @RequestMapping("/greetings")
    public ModelAndView greetings(@RequestParam String name){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index.jsp");
        mv.addObject("result","Greetings from Spring MVC "+name);
        return mv;
    }
}
