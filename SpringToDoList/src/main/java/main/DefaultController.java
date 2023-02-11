package main;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {

    @Value("${someParameter}")
    private Integer someParameter;

    @RequestMapping(value = "/")
    public String index(Model model) {
        model.addAttribute("someParameter", someParameter);
        return "index";
    }
}