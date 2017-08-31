import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Interface {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String selected;

    public void work(Banks banks, Client client) throws IOException {
        boolean flag = true;


        while (flag) {

            System.out.println("***************************");
            System.out.println("press 1 - Show all banks and all free Credits");
            System.out.println("press 2 - Pay money");
            System.out.println("press 3 - Change Terms");
            System.out.println("press 4 - Make Early Payment");
            System.out.println("press 5 - Show All Clients credits");
            System.out.println("press 0 - Exit");
            selected = br.readLine();
            Credit tempCredit;
            switch (selected) {
                case "1":
                    showAllBanksAndCredits(banks, client);
                    break;
                case "2":
                    tempCredit = selectCreditForPayment(banks, client);
                    System.out.println("Input money " + tempCredit.amountOfPaymentPerMonth);
                    selected = br.readLine();
                    tempCredit.payMoney(Double.valueOf(selected));
                    break;
                case "3":
                    tempCredit = selectCreditForPayment(banks, client);
                    System.out.println("write NEW TERM");
                    selected = br.readLine();
                    BankSystem.changeTermsOfCredit(tempCredit, client, Integer.valueOf(selected));
                    break;
                case "4":
                    tempCredit = selectCreditForPayment(banks, client);
                    System.out.println("Input money " + tempCredit.calculateTheEntireAamountToPayForLoan());
                    selected = br.readLine();
                    BankSystem.makefEarlyRepayment(tempCredit, Double.parseDouble(selected));
                    break;
                case "5":
                    showAllClientCredits(banks, client);
                    break;
                case "0":
                    flag = false;
                    break;


                default:
                    break;


            }
        }


    }

    public void showAllBanksAndCredits(Banks banks, Client client) throws IOException {
        System.out.println(banks.toString());
        boolean flag = true;
        while (flag) {
            System.out.println("--------------------");
            System.out.println("Press 1 - to select bank and credit");
            System.out.println("Press 0 - back to previous menu");
            selected = br.readLine();

            switch (selected) {
                case "1":
                    selectBank(banks, client);
                    break;
                case "0":
                    flag = false;
                    break;
                default:
                    break;

            }

        }


    }

    public void showAllClientCredits(Banks banks, Client client) {

        for (int i = 0; i < banks.banks.size(); i++) {
            for (Credit credit : banks.banks.get(i).credits) {
                if (credit.client != null & credit.client == client) {
                    System.out.println("---------------------------------------------------------------------------------");
                    System.out.println(banks.banks.get(i).bankName);
                    System.out.println(credit.toString());
                    System.out.println("---------------------------------------------------------------------------------");

                }
            }
        }
    }


    public void selectBank(Banks banks, Client client) throws IOException {
        banks.showJustBanks();
        System.out.println("//////////////////////////");
        System.out.println("write number of bank");
        String numberOfBank = br.readLine();
        banks.showJustCreditsInBank(Integer.parseInt(numberOfBank));
        System.out.println("write number of Credit");
        String numberOfCredit = br.readLine();
        banks.banks.get(Integer.parseInt(numberOfBank)).clientSelectCredit(Integer.parseInt(numberOfCredit), client);
    }

    public Credit selectCreditForPayment(Banks banks, Client client) throws IOException {

        System.out.println("//////////////////////////");
        ArrayList<Integer> bankNumbers = new ArrayList();
        ArrayList<Integer> creditNumbers = new ArrayList();
        for (int i = 0; i < banks.banks.size(); i++) {
            for (int y = 0; y < banks.banks.get(i).credits.size(); y++) {
                if (banks.banks.get(i).credits.get(y).client != null & banks.banks.get(i).credits.get(y).client == client) {
                    System.out.println("---------------------------------------------------------------------------------");
                    System.out.println(i + "- Number of Bank " + banks.banks.get(i).bankName);
                    System.out.println(y + " - Number Of Credit" + banks.banks.get(i).credits.get(y).toString());
                    System.out.println("---------------------------------------------------------------------------------");
                    bankNumbers.add(i);
                    creditNumbers.add(y);
                }
            }
        }
        System.out.println("write number of bank");
        String numberOfBank = br.readLine();
        System.out.println("write number of Credit");
        String numberOfCredit = br.readLine();
        if (bankNumbers.contains(Integer.parseInt(numberOfBank)) & creditNumbers.contains(Integer.parseInt(numberOfCredit))) {

            return banks.banks.get(Integer.parseInt(numberOfBank)).credits.get(Integer.parseInt(numberOfCredit));
        } else {
            selectCreditForPayment(banks, client);
        }
        return null;
    }


}
