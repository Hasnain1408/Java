package June09.exercise.oop;

//Main.java
public class MainStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Carolus Vitali", 11);
        Student student2 = new Student("Nakeisha Uhuru", 10);
        Student student3 = new Student("Gabriella Cherice", 10);
        System.out.println("Student Details:");
        student1.printStudentDetails();
        student2.printStudentDetails();
        student3.printStudentDetails();
        System.out.println("Adding courses for " + student1.getName());
        student1.addCourse("Math");
        student1.addCourse("Science");
        student1.addCourse("English");

        System.out.println(student1.getName() + "'s courses: " + student1.getCourses());

        System.out.println("\nAdding courses for " + student2.getName());
        student2.addCourse("History");
        student2.addCourse("Geography");
        student2.addCourse("English");
        System.out.println(student2.getName() + "'s courses: " + student2.getCourses());
        System.out.println("\nRemoving 'Science' course for " + student1.getName());
        student1.removeCourse("Science");
        System.out.println(student1.getName() + "'s courses: " + student1.getCourses());
    }
}
