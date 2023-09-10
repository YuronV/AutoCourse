public class Student {
    private int studentId;
    private String firstName;
    private String lastName;
    private int course;
    private double mathScore;
    private double economyScore;
    private double foreignLanguageScore;

    public Student(int studentId, String firstName, String lastName, int course, double mathScore, double econScore, double foreignLanguageScore) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.mathScore = mathScore;
        this.economyScore = econScore;
        this.foreignLanguageScore = foreignLanguageScore;
    }

    public double calculateAverage() {
        return (mathScore + economyScore + foreignLanguageScore) / 3;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}