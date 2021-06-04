package StudentDataBaseApplication;

import java.util.Scanner;

public class Student {
    private String studentID;
    private static int tuition = 0;
    private static int coursesTuition = 600;
    private static int id = 1000;
    private String firstName;
    private String lastName;
    private String courses;
    private int gradeYear;

    //constructor method (enter the student name and grade year)
    public Student() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the student's first name:");
        this.firstName = scanner.nextLine();
        System.out.println("Enter the student's second name:");
        this.lastName = scanner.nextLine();
        System.out.println("Enter the student's grade year:\n 1- For first year\n 2-For second year \n 3-For third year\n 4-For fourth year");
        this.gradeYear = scanner.nextInt();
        System.out.println("firstname:" + this.firstName + " " + "lastname:" + this.lastName + " " + "grade year:" + this.gradeYear);

        generateID();
    }
// Generate an ID method

    private void generateID() {
        id++;
        this.studentID = gradeYear + "" + id;
        System.out.println(this.studentID);
    }

    // Enroll the courses method
    public void courses() {
do {
    System.out.println("Enter a course that the student will be enrolled:");
    System.out.println("Please note that press Q button for quit the system.");
    Scanner scanner = new Scanner(System.in);
    String course = scanner.nextLine();
    if(!course.equals("Q")){
courses=courses + " " + course;
tuition = tuition + coursesTuition;
    }
    else{
        System.out.println("The system should be quit!");
        break;
    }
}while (true);
        System.out.println("Enrolled in:" + " "+ courses) ;
        System.out.println("The price will be: " + " " + tuition);
    }
}
// Pay tuition calculate method
// Show status method




