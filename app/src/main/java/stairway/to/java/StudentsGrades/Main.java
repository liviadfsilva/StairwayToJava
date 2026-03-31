package stairway.to.java.StudentsGrades;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student[] students = new Student[3];

        for (int i = 0; i < students.length; i++) {
            System.out.println("Type the student's name:");
            String name = scanner.nextLine();
            System.out.println("Type the student's age:");
            int age = scanner.nextInt();
            System.out.println("Type the student's grade #1:");
            double grade1 = scanner.nextDouble();
            System.out.println("Type the student's grade #2:");
            double grade2 = scanner.nextDouble();

            students[i] = new Student(name, age, grade1, grade2);

            scanner.nextLine();
        }

        for (Student student : students) {
            student.introduceStudent();    
            System.out.println();        
        }

        scanner.close();
    }
}
