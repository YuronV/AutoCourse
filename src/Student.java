public class Student {
    private String name;
    private int course;
    private int grade;

    public Student(String name, int course, int grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 3) {
            this.name = name;
        } else {
            System.out.println("Name should contains at least 3 letter");
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course >= 1 && course <= 4) {
            this.course = course;
        } else {
            System.out.println("Course should be [1; 4]");
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade <= 10) {
            this.grade = grade;
        } else {
            System.out.println("Grade should be [1; 10]");
        }
    }

    public void showInfo() {
        System.out.println("Name " + name);
        System.out.println("Course " + course);
        System.out.println("Grade " + grade);
    }
}


