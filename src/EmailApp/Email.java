package EmailApp;

import java.util.Scanner;

public class Email {

private String firstName;
private String lastName;
private String alterEmailAddress;
private String email;
private String password;
private String department;
private String companySuffix="company.com";
private int mailboxCap =500;
private int defaultPasswordLength = 10;

    //constructor to receive the first name and last name
public Email(String firstName, String lastName){
    this.firstName=firstName;
    this.lastName=lastName;
    System.out.println("Email is created: " + this.firstName +  " "  + this.lastName);

    //calling a method for asking a department - return the department
    this.department = setDepartment();
    System.out.println("You have chosen the department of: " + this.department);

    //calling a method that returns a random password
    this.password=randomPassword(defaultPasswordLength);
    System.out.println("Your password is: " + password);

    //combine elements to generate the email
email=firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "."+ companySuffix;
    System.out.println(email);

}

    //ask for the department
    private String setDepartment(){
        System.out.println("Enter the department \n1 for Sales\n2 for Development\n3 for Accounting\n0 for none");
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();
        if(departmentChoice == 1){
            return  "Sales";
        }
        else if (departmentChoice == 2){
            return "Development";
        }
        else if(departmentChoice==3){
            return "Accounting";
        }
        else {
            return " ";
        }

    }
    //generate a random password

    private String randomPassword(int length){

    String passwordSet = "ABCDEFGHIJKLMNOPRSTUVYZ!'^+%&/()=?/-+" ;
    char[] password = new char [length];
    for (int i = 0; i<length;i++){
        int rand =  (int) (Math.random() * passwordSet.length());
        password[i]=passwordSet.charAt(rand);
    }
    return new String (password);
    }

    // set the mailboxcap
public void setMailboxCap(int cap){
    this.mailboxCap=cap;
}
    //set the alter email
    public void setAlterEmailAddress(String alterEmailAddress){
    this.alterEmailAddress=alterEmailAddress;
    }

    // change the password
public void changePassword(String password){
    this.password=password;
}
public int getMailboxCap(){
    return  mailboxCap;
}
public String getAlterEmailAddress(){
    return alterEmailAddress;
}

public String getPassword(){
    return password;
}

public String showInfo(){
return "DISPLAY NAME: " + firstName + " " + lastName+ " " + "COMPANY EMAIL: " + email + "MAILBOX CAP: " + mailboxCap;


}


}
