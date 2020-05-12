package marco.springboot.mybatisdemo.controller;

import marco.springboot.mybatisdemo.entity.Student;
import marco.springboot.mybatisdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService service;

    @GetMapping(value = {"/getStudentById/{id}"})
    public String getStudentById(@PathVariable("id") String id) {
        System.out.println(service.getStudentById(new Integer(id)).getName());
        return "HelloWord";
    }

    @GetMapping(value = {"/selectAll"})
    public List<Student> selectAll() {
        return service.selectAll();
    }
}
