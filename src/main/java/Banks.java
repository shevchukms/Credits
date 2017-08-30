import java.util.ArrayList;


public class Banks {
    ArrayList<Bank> banks=new ArrayList<Bank>();

    public void addBank(Bank bank) {
        this.banks.add(bank);
    }

    public Bank getBank(BankName bankName) {
        for (Bank bank : banks) {
            if (bank.bankName == bankName) {
                return bank;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Banks{" +
                "banks=" + banks.toString() +
                '}';
    }
}
