public class BankSystem {

    public void changeTermsOfCredit(Credit credit, Double newTerm) {
        if (credit.getCreditSpec().isPossibilityToChangeTerms()) {
            credit.getCreditSpec().setTermOfCrediting(newTerm);
            credit.calculateAmountOfPaymentPerMonth();
        }
    }
    public void makefEarlyRepayment(Credit credit, Double money){
        if (credit.getCreditSpec().isPossibilityOfEarlyRepayment()) {
            credit.payMoney(money);
        }
    }

}
