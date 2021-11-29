package ro.fasttrackit.curs9.homework;

public class Student {
    private static int GRADE_SUM = 0;
    private static int STUDENT_COUNT = 0;

    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        GRADE_SUM += this.grade;
        STUDENT_COUNT++;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public static double getAverageGrade() {
        return (double) GRADE_SUM / STUDENT_COUNT;
    }
}
