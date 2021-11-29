package ro.fasttrackit.curs9.homework;

public class StudentMain {
    public static void main(String[] args) {
        new Student("Ana", 10);
        new Student("Maria", 7);
        new Student("Ioan", 6);
        new Student("Darius", 10);
        new Student("Alex", 9);
        new Student("Cornel", 8);
        new Student("Bogdan", 4);
        new Student("Calin", 9);
        new Student("Paul", 7);

        System.out.println(Student.getAverageGrade());
    }
}
