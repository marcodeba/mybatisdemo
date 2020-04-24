package marco.springboot.mybatisdemo;

import marco.springboot.mybatisdemo.entity.Student;
import marco.springboot.mybatisdemo.service.StudentService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentServiceImplTest {

    @Autowired
    StudentService service;

    @Test
    public void testGetStudentById() {
        Student student = service.getStudentById(5);
        Assert.assertEquals("小强", student.getName());
    }

    @Test
    public void testSelectAll() {
        List records = service.findAll();
        Assert.assertEquals(6, records.size());
    }
}
