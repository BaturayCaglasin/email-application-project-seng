package EmailApp;

public class EmailApp {
    public static void main(String[] args) {

        Email email1 = new Email("John","Smith");
        email1.setMailboxCap(30);
        email1.setAlterEmailAddress("js@gmail.com");
        System.out.println("Alternative Email Address is: " + email1.getAlterEmailAddress());
        System.out.println(email1.showInfo());






    }
}
