public class BankSystem {

    public void changeTermsOfCredit(Credit credit, Integer newTerm) {
        if (credit.getCreditSpec().isPossibilityToChangeTerms()) {
            credit.getCreditSpec().setTermOfCreditingMonths(newTerm);
            credit.calculateAmountOfPaymentPerMonth();
        }
    }
    public void makefEarlyRepayment(Credit credit, Double money){
        if (credit.getCreditSpec().isPossibilityOfEarlyRepayment()) {
            credit.payMoney(money);
        }
    }

}
