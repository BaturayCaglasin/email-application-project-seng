package StudentDataBaseApplication;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Student {
    private String studentID;
    private static int balancetuition = 0;
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
    if(!course.contentEquals("Q" )){
    courses=courses + " " + course;
    balancetuition = balancetuition + coursesTuition;
    }
    else{
        System.out.println("The system should be quit!");
        break;
    }
}while (true);
        System.out.println("Enrolled in:" + " "+ courses) ;
        System.out.println("The price will be: " + " " + balancetuition);
    }


//view balance

public void viewBalance(){
    System.out.println("Your balance is: " + balancetuition);
}


// Pay tuition calculate method
public void payTuition(){ //payment: adamın kredi miktarı
       System.out.println("Enter your payment: ");
        Scanner scanner = new Scanner(System.in);
        int payment = scanner.nextInt();
        System.out.println("Your entered payment is: " + payment);
        balancetuition = balancetuition - payment;
        System.out.println("Thank you for your payment: " + " " + payment);
        viewBalance();

}

// Show status method
    public String showStatus(){
        return "Student Name: " + firstName + "  " + lastName +  " " + " The courses he / she enrolled: " + " " + courses + " " + "Balance: " + " " + balancetuition;
    }


}

