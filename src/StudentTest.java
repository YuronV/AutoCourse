public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Alex", "Piterson", 2, 59, 59, 50);
        Student student2 = new Student(2, "Olya", "Smith", 3, 80, 59, 77);
        Student student3 = new Student(3, "Tom", "Hardy", 1, 50, 50, 90);

        System.out.println("Student 1: " + student1.getFullName() + ", Average Score: " + student1.calculateAverage());
        System.out.println("Student 2: " + student2.getFullName() + ", Average Score: " + student2.calculateAverage());
        System.out.println("Student 3: " + student3.getFullName() + ", Average Score: " + student3.calculateAverage());
    }
}
