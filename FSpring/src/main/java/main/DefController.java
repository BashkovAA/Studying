package main;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class DefController {


    @Value("${someParameter}")
    private Integer someParameter;

    @RequestMapping("/")
    public String index(Model model)
    {
        model.addAttribute("someParameter", someParameter);
        return "index";
    }

}
