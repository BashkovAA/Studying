package main;

import main.model.Task;
import main.model.TasksRepository;
import org.apache.maven.surefire.api.testset.TestRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class TaskController {

    @Autowired
    private TasksRepository tasksRepository;

    //    @PostMapping(value = "/tasks/", consumes = {MediaType.APPLICATION_JSON_VALUE})
//    public ResponseEntity add(@RequestBody TestRequest testRequest) {
//        System.out.println(testRequest.getTestListResolver());
//        return new ResponseEntity(HttpStatus.CREATED);
//    }
    @PostMapping(value = "/tasks", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity add(@RequestBody Task task) {
        tasksRepository.save(task);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping("/tasks")
    public List<Task> list() {
        Iterable<Task> taskIterable = tasksRepository.findAll();
        ArrayList<Task> tasks = new ArrayList<>();
        for (Task task : taskIterable) {
            tasks.add(task);
        }
        return tasks;
    }

    @GetMapping("/tasks/{id}")
    public ResponseEntity get(@PathVariable int id) {
        Optional<Task> taskOptional = tasksRepository.findById(id);
        if (taskOptional.isPresent()) {
            return new ResponseEntity(taskOptional.get(), HttpStatus.OK);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

    @PatchMapping("/tasks/{id}")
    public ResponseEntity patch(@PathVariable int id,
                                @RequestBody boolean isDone,
                                @RequestBody String title,
                                @RequestBody String description) {
        Optional<Task> taskOptional = tasksRepository.findById(id);
        if (taskOptional.isPresent()) {
            Task newTask = taskOptional.get();
            newTask.setIsDone(isDone);
            newTask.setTitle(title);
            newTask.setDescription(description);
            tasksRepository.save(newTask);
            return new ResponseEntity(newTask, HttpStatus.OK);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

    @DeleteMapping("/tasks/{id}")
    public ResponseEntity delete(@PathVariable int id) {
        Optional<Task> taskOptional = tasksRepository.findById(id);
        if (taskOptional.isPresent()) {
            tasksRepository.deleteById(id);
            return new ResponseEntity(HttpStatus.OK);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }
}
//        Task newTask = new Task();
//        newTask.setTitle(title);
//        newTask.setDescription(description);
//        tasksRepository.save(newTask);

//    @PostMapping(value = "/tasks/", consumes = {MediaType.APPLICATION_JSON_VALUE})
//    public ResponseEntity add(@RequestBody Task task) {
//        tasksRepository.save(task);
//        return new ResponseEntity(HttpStatus.CREATED);
//    }