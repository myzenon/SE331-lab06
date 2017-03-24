package camt.cbsd.dao;

import camt.cbsd.entity.Student;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Profile("secondDataSource")
@ConfigurationProperties(prefix="server")
@Repository
public class StudentSecondDaoImpl extends AbstractStudentDao {

    @PostConstruct
    private void init() {
        imageBaseUrl = baseUrl + imageUrl;
        students = new ArrayList<>();
        Student student = new Student(1,"SE-000","Chartchai","D",
                5.00,imageBaseUrl + "temp.gif",true,0,
                "The Special One");
        students.add(student);

    }

}
