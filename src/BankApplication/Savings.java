package BankApplication;

public class Savings extends Account {

    private int safetyDepositBoxID;
    private int getSafetyDepositBoxKey;

    //Constructor to initialize savings account properties
    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();


    }

    private void setSafetyDepositBox() {

        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        getSafetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));


    }

    public void setRate() {
        System.out.println("Implement rate for Saving");
        rate = getBaseRate() * -(0.25);
    }

    //List any methods for specific to savings account

    public void showInfo() {
        super.showInfo(); //!!! POLYMORPHISM. OVER-RIDING
        System.out.println("ACCOUNT TYPE: SAVINGS");
        System.out.println(
                "YOUR SAVINGS ACCOUNT FEATURES" + " " + " safetyDepositBoxID: " + " " + safetyDepositBoxID + " " + "SafetyDepositBoxKey: " + " " + getSafetyDepositBoxKey
                        + " " + "RATE: " + "%" + rate
        );
    }

}



