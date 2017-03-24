package camt.cbsd.dao;

import camt.cbsd.entity.Student;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by CAMT on 3/24/2017.
 */
public abstract class AbstractStudentDao implements StudentDao {
    String baseUrl;
    String imageUrl;
    String imageBaseUrl;
    List<Student> students;
    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public List<Student> getStudents(){
        return this.students;
    }

    @Override
    public Student findById(long id) {
        return students.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
    }
}
