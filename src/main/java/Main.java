import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        Banks listOfBanks = new Banks();
        listOfBanks.addBank(new Bank(BankName.KREDOBANK, new ArrayList<Credit>()));
        listOfBanks.addBank(new Bank(BankName.OSHCHADBANK, new ArrayList<Credit>()));
        listOfBanks.addBank(new Bank(BankName.PRIVATBANK, new ArrayList<Credit>()));

        listOfBanks.getBank(BankName.KREDOBANK).addCredit(new Credit((double) 1000, new CreditSpec(8.0, 15, CreditAim.FORCAR)));
        listOfBanks.getBank(BankName.KREDOBANK).addCredit(new Credit((double) 2000, new CreditSpec(9.0, 18, CreditAim.FORHOMETECHNICS)));
        listOfBanks.getBank(BankName.KREDOBANK).addCredit(new Credit((double) 5000, new CreditSpec(10.0, 19, CreditAim.FORHOMETECHNICS)));


        listOfBanks.getBank(BankName.OSHCHADBANK).addCredit(new Credit((double) 3000, new CreditSpec(11.0, 20, CreditAim.FORCAR, true, false)));
        listOfBanks.getBank(BankName.OSHCHADBANK).addCredit(new Credit((double) 4000, new CreditSpec(12.0, 21, CreditAim.FORCAR, false, true)));
        listOfBanks.getBank(BankName.OSHCHADBANK).addCredit(new Credit((double) 5000, new CreditSpec(13.0, 22, CreditAim.FORCAR, true, true)));

        listOfBanks.getBank(BankName.PRIVATBANK).addCredit(new Credit((double) 6000, new CreditSpec(14.0, 23, CreditAim.FORCAR, true, true)));
        listOfBanks.getBank(BankName.PRIVATBANK).addCredit(new Credit((double) 7000, new CreditSpec(14.1, 23, CreditAim.FORCAR, true, true)));
        listOfBanks.getBank(BankName.PRIVATBANK).addCredit(new Credit((double) 8000, new CreditSpec(14.5, 23, CreditAim.FORCAR, true, true)));

        Client client = new Client(new PersonalDataOfClient("Mykola", "Shevchuk", "101101010", "VD", "12313"));
        Interface anInterface = new Interface();
        anInterface.work(listOfBanks, client);


        

    }
}
