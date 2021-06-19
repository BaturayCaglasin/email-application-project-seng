package BankApplication;

import java.util.LinkedList;
import java.util.List;

public class BankAcccountApp {
    public static void main(String[] args) {

        List <Account> accounts = new LinkedList<Account>();
        String file = "C:\\Users\\asus\\Downloads";

//        Checkings checkapp1 = new Checkings("Tom Wilson", "111111111", 1500);
//        Savings savapp1 = new Savings("Rich Lowe", "222222222", 2500);
//        checkapp1.showInfo();
//        System.out.println("*********");
//        savapp1.showInfo();
//
//        savapp1.deposit(5000);
//        savapp1.withdraw(200);
//        savapp1.transfer("Brokerage", 200);
//
//        checkapp1.deposit(5000);
//        checkapp1.withdraw(200);
//        checkapp1.transfer("Brokerage", 200);
//
//        savapp1.compound();
//        checkapp1.compound();

        List<String[]> newAccountHolders = BankApplication.util.CSV.read(file);
        for (String[] accountHolder : newAccountHolders) {
            System.out.println("NEW ACCOUNT:");
            String name= accountHolder[0];
            String sSN=accountHolder[1] ;
            String accountType=accountHolder[2];
            double initDeposit=Double.parseDouble(accountHolder[3]);

            System.out.println(name);
            System.out.println(sSN);
            System.out.println(accountType);
            System.out.println(initDeposit);

            if(accountType.equals("Savings")){
                System.out.println("OPEN A SAVINGS ACCOUNT");
            }
            else{
                System.out.println("OPEN A CHECKINGS ACCOUNT");
            }

        }

    }

}

