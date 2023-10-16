package coursedatabase.dbcourses;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetCourses {


    private final  jdbcrepo jdbcrepo;

    public GetCourses(coursedatabase.dbcourses.jdbcrepo jdbcrepo) {
        this.jdbcrepo = jdbcrepo;
    }


    @GetMapping("/api/getcourses")
        public List<Object> getcourseArray(){

        return jdbcrepo.fetchcourses();
    }
}
