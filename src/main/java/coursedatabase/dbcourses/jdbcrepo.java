package coursedatabase.dbcourses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class jdbcrepo {


    private String AddQuery =

            """
            INSERT INTO `Courses`.`CoursesList` (`CourseName`, `CoursePrice`, `CourseDescription`) VALUES ( 'docker course', 100, "virtualization" );
            
            
            """;


    private String getall =

            """
            SELECT * FROM Courses.CoursesList;
            """;



    @Autowired
    JdbcTemplate jdbcTemplate;
    public void InsertCourse() {
            jdbcTemplate.update(AddQuery);
    }


    public List<Object> fetchcourses(){


        return jdbcTemplate.query(getall, (rs, Rownm) ->
                {

                    Course mycourses = new Course();

                    mycourses.setCourseiD(rs.getInt("CourseId"));
                    mycourses.setCourse_Name(rs.getString("CourseName"));
                    mycourses.setCourse_Price(rs.getInt("CoursePrice"));
                    mycourses.setCourseDescription(rs.getString("CourseDescription"));

                    return mycourses;




                }


                );
    }


    // deleting course by ID





}
