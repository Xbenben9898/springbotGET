package coursedatabase.dbcourses.CourserController;


import coursedatabase.dbcourses.Courses.Course;
import coursedatabase.dbcourses.jdbcrepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetCourses {

    private final coursedatabase.dbcourses.jdbcrepo jdbcrepo;

    public GetCourses(coursedatabase.dbcourses.jdbcrepo jdbcrepo) {
        this.jdbcrepo = jdbcrepo;
    }

    @GetMapping("/api/getcourses")
        public List<Object> getcourseArray(){

        return jdbcrepo.fetchcourses();
    }

    @PostMapping("/api/uploadCourse")
    public String UploadCourse(@RequestParam String Name ,
                               int price,
                               String description){

        Course newcourse = new Course();

        newcourse.setCourse_Name(Name);
        newcourse.setCourse_Price(price);
        newcourse.setCourseDescription(description);

        boolean check  = jdbcrepo.InsertCourse(
                newcourse.getCourse_Name(),
                newcourse.getCourse_Price(),
                newcourse.getCourseDescription());

        return check == true? "ok":  "bad";

    }
}
