package coursedatabase.dbcourses;

import com.mysql.cj.xdevapi.Warning;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class CourseJdbcCommandLinerunner implements CommandLineRunner {


    @Autowired
    private jdbcrepo jdbcrepo;

    @Override
    public void run(String... args) throws Exception {




    }



}
