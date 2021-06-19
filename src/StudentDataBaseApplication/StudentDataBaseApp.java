package StudentDataBaseApplication;

import java.util.Scanner;

public class StudentDataBaseApp {
    public static void main(String[] args) {
//Ask how many students will be added
        System.out.println("Enter how many students will be enrolled: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = scanner.nextInt();
        Student[] students = new Student[numberOfStudents - 1];


// Add that number of students on the database
        for (int i = 0; i < numberOfStudents; i++) {
            students[i] = new Student(); //!
            students[i].courses();
            students[i].payTuition();
            //  System.out.println(students[i].showStatus());
        }
        System.out.println(students[0].showStatus());
        System.out.println(students[1].showStatus());
        System.out.println(students[2].showStatus());

    }
}
