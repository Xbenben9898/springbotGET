package coursedatabase.dbcourses;

public class Course {


    private int CourseiD;
    private String Course_Name;
    private int Course_Price;
    private String CourseDescription;


    public Course(){

    }
    public Course(int courseiD, String course_Name, int course_Price, String courseDescription) {
        CourseiD = courseiD;
        Course_Name = course_Name;
        Course_Price = course_Price;
        CourseDescription = courseDescription;
    }

    public int getCourseiD() {
        return CourseiD;
    }

    public void setCourseiD(int courseiD) {
        CourseiD = courseiD;
    }

    public String getCourse_Name() {
        return Course_Name;
    }

    public void setCourse_Name(String course_Name) {
        Course_Name = course_Name;
    }

    public int getCourse_Price() {
        return Course_Price;
    }

    public void setCourse_Price(int course_Price) {
        Course_Price = course_Price;
    }

    public String getCourseDescription() {
        return CourseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        CourseDescription = courseDescription;
    }
}


