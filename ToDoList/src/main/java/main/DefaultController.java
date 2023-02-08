package main;

import main.model.TasksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DefaultController {

    @Autowired
    private TasksRepository tasksRepository;

    @Value("${someParameter}")
    private String someParameter;

    @RequestMapping("/")
    public String index(Model model) {

        model.addAttribute("someParameter", someParameter);
        return (new Date()).toString();
    }
}
