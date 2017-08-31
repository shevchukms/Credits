public class BankSystem {

    public static void changeTermsOfCredit(Credit credit, Client client, Integer newTerm) {
        if (credit.getCreditSpec().isPossibilityToChangeTerms()) {
            credit.getCreditSpec().setTermOfCreditingMonths(newTerm);
            credit.calculateAmountOfPaymentPerMonth();
        }
        else{
            System.out.println("it's impossible to change terms in this credit according to the contract");
        }
    }

    public static void makefEarlyRepayment(Credit credit, Double money) {
        if (credit.isActive) {
            if (credit.getCreditSpec().isPossibilityOfEarlyRepayment()) {
                credit.payMoney(money);
            }
        } else {
            System.out.println("Credit is Closed");
        }
    }

}
