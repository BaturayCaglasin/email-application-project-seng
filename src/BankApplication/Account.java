package BankApplication;

//Parent class of Checkings and Savings classes

//Abstract class yaratarak Account class'ından obje üretimini kitledik. Artık bu class'tan bir obje türetilemez.
//Implements kullanarak IBaseRate i kapsar diyerek tüm obje ve metotlarını kullanabilir hale geldik.


public abstract class Account implements IBaseRate {
    private String name;
    private String sSN;
    private double balance;

    private static int index = 10000;
    protected String accountNumber;
    protected double rate;

    //Constructor to set base properties  and initialize the account

    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;

        //Set account number:
        index++;
        this.accountNumber = setAccountNumber();
        setRate();


    }

    public abstract void setRate(); //class abstract yaratıldığı için object üretilemeyecekti ama bu metot bu durumu handle edecek.
    //savings ve checkings metotlarında setRate isminde birer metot yaratıldı buradaki metota abstract denilerek. (Abstract abstractı nötr'ledi.)


    private String setAccountNumber() {
        String lastTwoOfSSN = sSN.substring(sSN.length() - 2, sSN.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }


    //List common methods

    public void compound() {
        double accuredInterest = balance * (rate / 100);
        balance = balance + accuredInterest;
        System.out.println("Accurred Interest:" + " " + accuredInterest);
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Depositing: " + amount);
        printBalance();
    }

    public void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Withdrawing: " + amount);
        printBalance();
    }


    public void transfer(String toWhere, double amount) {
        balance = balance - amount;
        System.out.println("Transfering: " + amount + " " + "to: " + " " + toWhere);
        printBalance();
    }

    public void printBalance() {
        System.out.println("Your balance right now: " + " " + balance);
    }

    public void showInfo() {

        System.out.println("NAME: " + " " + name +
                "\nACCOUNT NUMBER :" + " " + accountNumber +
                "\nBALANCE: " + " " + balance
        );


    }

}

