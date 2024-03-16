import java.util.List;
import java.util.ArrayList;

public class Lecture extends Person{
    private int employeeID;
    private List<Course> coursesTaught;

    public Lecture(String name, int age, String address, int employeeID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<>();
    }

    @Override void getDetails() {
        System.out.println("Nama\t: " + name);
        System.out.println("Usia\t: " + age);
        System.out.println("Alamat\t: " + address);
        System.out.println("EmployeeID\t: " + employeeID);
    }    

    public void teachCourse(Course course) {
        coursesTaught.add(course);
    }

    public void viewTaughtCourses() {
        System.out.println("Taught Courses\t ");
        for (Course course : coursesTaught){
            course.getDetails();
        }
    }

}
