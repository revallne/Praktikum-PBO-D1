import java.util.List;
import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private String address;
    private int studentID;
    private List<Course> coursesEnrolled;

    public Student(String name, int age, String address, int studentID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.studentID = studentID;
        this.coursesEnrolled = new ArrayList<>();
    }
    public String getName() {
        return name;
    }

    public void getDetails() {
        System.out.println("Nama\t: " + name);
        System.out.println("Usia\t: " + age);
        System.out.println("Alamat\t: " + address);
        System.out.println("StudentID\t " + studentID);
    }

    public void enrollInCourse(Course course) {
        coursesEnrolled.add(course);
    }

    public void viewEnrolledCourses() {
        System.out.println("Enrolled Courses");
        for (Course course : coursesEnrolled) {
        course.getDetails();
        }
    }

}
