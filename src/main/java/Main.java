import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Banks listOfBanks=new Banks();
        listOfBanks.addBank(new Bank(BankName.KREDOBANK,new ArrayList<Credit>()));

        listOfBanks.getBank(BankName.KREDOBANK).addCredit(new Credit((double) 5000,new CreditSpec( 10.0, 18.0,CreditAim.FORHOMETECHNICS)));
        listOfBanks.getBank(BankName.KREDOBANK).addCredit(new Credit((double) 1000,new CreditSpec( 12.0, 12.0,CreditAim.FORCAR)));
        listOfBanks.getBank(BankName.KREDOBANK).addCredit(new Credit((double) 1000,new CreditSpec( 11.0, 18.0,CreditAim.FORHOMETECHNICS)));




        System.out.println(listOfBanks.toString());



    }
}
