package BankApplication;

public class Checkings extends Account {

    private int debitCardNumber;
    private int debitCardPIN;

    //Constructor to initialize checking account properties

    public Checkings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setDebitCard();
    }

    private void setDebitCard() {
        debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
        debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
    }

    public void setRate() {
        System.out.println("Implement rate for Checking");
        rate = getBaseRate() * 15;

    }

    //List any methods for specific to checking account

    public void showInfo() {
        super.showInfo();//!!! POLYMORPHISM. OVER-RIDING
        System.out.println("ACCOUNT TYPE: CHECKING");
        System.out.println(
                "YOUR CHECKING ACCOUNT FEATURES" + " " + " debitCardNumber: " + " " + debitCardNumber + " " + "debitCardPIN: " + " " + debitCardPIN + " " + "RATE: " + "%" + rate
        );
    }


}
