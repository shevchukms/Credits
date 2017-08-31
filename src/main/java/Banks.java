import java.util.ArrayList;


public class Banks {
    ArrayList<Bank> banks = new ArrayList<Bank>();

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

    public void showJustBanks() {
        for (int i = 0; i < banks.size(); i++) {
            System.out.println(i + " Bank is - "+banks.get(i).bankName);
        }
    }

    public void showJustCreditsInBank(int bankNumber) {
        for (int i = 0; i < banks.get(bankNumber).credits.size(); i++) {
            if(banks.get(bankNumber).credits.get(i).getClient()==null){
            System.out.println(i+" "+  banks.get(bankNumber).credits.get(i).toString());
        }}
    }


    @Override
    public String toString() {
        return "Banks{" +
                "banks=\n" + banks.toString() +
                '}';
    }
}
