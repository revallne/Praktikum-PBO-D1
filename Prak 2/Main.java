public class Main {
    public static void main(String[] args) {
        Lecture Cecep = new Lecture("Cecep", 55, "Magelang", 350123);
        Lecture Susi = new Lecture("Susi", 40, "Semarang", 350222);
        Lecture Asro = new Lecture("Asro", 45, "Yogyakarta", 350789);
        
        Student Reva = new Student("Reva", 20, "Prima Cemara", 199108);
        Student Qarina = new Student("Qarina", 18, "Griya Borobudur", 199177);
        Student Tera = new Student("Tera", 20, "Sigar Bencah", 199211);
        
        Course D101 = new Course("D101", "Matematika 1", Susi);
        Course D102 = new Course("D102", "Basis Data", Cecep);
        Course D103 = new Course("D103", "Dasar Pemrograman", Asro);
        
        Susi.teachCourse(D101);
        Cecep.teachCourse(D102);
        Asro.teachCourse(D103);
    
        D101.addStudent(Reva);
        D101.addStudent(Qarina);
    
        D102.addStudent(Reva);
        D102.addStudent(Tera);
    
        D103.addStudent(Qarina);
        D103.addStudent(Tera);

        Reva.enrollInCourse(D101);
        Qarina.enrollInCourse(D103);
        Tera.enrollInCourse(D103);

        D103.removeStudent(Tera);

        System.out.println("Reva");
        Reva.viewEnrolledCourses();
        System.out.println("\n");

        System.out.println("Cecep");
        Cecep.viewTaughtCourses();
        System.out.println("\n");

        System.out.println("D101");
        D101.viewEnrolledStudents();
      }  
}
