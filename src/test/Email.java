package test;

import java.util.Scanner;

public class Email {

private String firstName;
private String lastName;
private String password;
private String alterEmail;
private String department;
private int emailCap;

//constructor to receive the first name and the last name:

    public Email(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        System.out.println("Email is created: " + this.firstName + " " + this. lastName);

        //calling the setted department:
        this.department=setDepartment();
        System.out.println("You have chosen the department of: " + this.department);

    }


//set the department

private String setDepartment(){
    System.out.println("Choose a department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None");
    Scanner scanner = new Scanner(System.in);

   int choosenDepartment =scanner.nextInt();

if(choosenDepartment==1){
    return  "Sales";
}
else if (choosenDepartment==2){
    return "Development";
}
else if (choosenDepartment ==3){
    return  "Accounting";

}
else {
    return " ";

}

}
}
