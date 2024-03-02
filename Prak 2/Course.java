import java.util.List;
import java.util.ArrayList;

public class Course {

    private String courseCode;
    private String courseName;
    private Lecture lecture;
    private List<Student> studentsEnrolled;

    public Course(String courseCode, String courseName, Lecture lecture) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.lecture = lecture;
        this.studentsEnrolled = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentsEnrolled.add(student);
    }

    public void removeStudent(Student student) {
        studentsEnrolled.remove(student);
    }

    public void viewEnrolledStudents() {
        System.out.println("Enrolled Students");
        for (Student student : studentsEnrolled) {
        student.getDetails();
        }
    }

    public void getDetails() {
        System.out.println("Kode course\t: " + courseCode);
        System.out.println("Nama course\t: " + courseName);
        System.out.println("Lecturer\t: " + lecture.name);
 
    }      
}
