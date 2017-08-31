import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
            System.out.println("press 4 - Make Full Payment");
            System.out.println("press 5 - Show All Clients credits");
            System.out.println("press 0 - Make Full Payment");
            selected = br.readLine();

            switch (selected) {
                case "1":
                    showAllBanksAndCredits(banks, client);
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
                if (credit.client != null & credit.client==client) {
                    System.out.println(banks.banks.get(i).bankName);
                    System.out.println(credit.toString());
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


}
