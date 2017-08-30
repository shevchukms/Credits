import java.util.ArrayList;


public class Bank {
    BankName bankName;
    ArrayList<Credit>credits;

    public Bank(BankName bankName, ArrayList<Credit> credits) {
        this.bankName = bankName;
        this.credits = credits;
    }

    public void addCredit(Credit credit) {
        this.credits.add(credit);
    }
}
