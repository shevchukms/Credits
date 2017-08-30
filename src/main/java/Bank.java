import java.util.ArrayList;


public class Bank {
    BankName bankName;
    ArrayList<Credit> credits;

    public Bank(BankName bankName, ArrayList<Credit> credits) {
        this.bankName = bankName;
        this.credits = credits;
    }

    public void addCredit(Credit credit) {
        this.credits.add(credit);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "\nbankName=" + bankName +
                ",credits=\n" + printCredits() +
               "}" ;
    }

    public String printCredits() {
        String tempS = new String();
        for (int i = 0; i < this.credits.size(); i++) {
            tempS = tempS + credits.get(i).toString() + "\n";
        }
        return tempS;
    }
}
