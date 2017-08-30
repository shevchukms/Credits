import java.util.ArrayList;
import java.util.HashSet;


public class Banks {
    HashSet<Bank> banks=new HashSet<Bank>();

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
                "banks=\n" + banks.toString() +
                '}';
    }
}
