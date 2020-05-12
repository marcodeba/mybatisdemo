package marco.springboot.mybatisdemo.service;

import marco.springboot.mybatisdemo.entity.Student;
import marco.springboot.mybatisdemo.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;

    public Student getStudentById(Integer studentId) {
        return studentMapper.selectByPrimaryKey(studentId);
    }

    public List<Student> selectAll() {
        return studentMapper.selectAll();
    }
}
