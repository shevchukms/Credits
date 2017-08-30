public class CreditSpec {
    protected Double interestRate;
    protected Double termOfCreditingMonths;
    protected boolean possibilityOfEarlyRepayment = false;
    protected boolean possibilityToChangeTerms = false;
    protected CreditAim creditAim;

    public CreditSpec(Double interestRate, Double termOfCreditingMonths, CreditAim creditAim) {
        this.interestRate = interestRate;
        this.termOfCreditingMonths = termOfCreditingMonths;
        this.creditAim = creditAim;
    }

    public CreditSpec(Double interestRate, Double termOfCreditingMonths, CreditAim creditAim, boolean possibilityOfEarlyRepayment, boolean possibilityToChangeTerms) {
        this.interestRate = interestRate;
        this.termOfCreditingMonths = termOfCreditingMonths;
        this.possibilityOfEarlyRepayment = possibilityOfEarlyRepayment;
        this.possibilityToChangeTerms = possibilityToChangeTerms;
        this.creditAim = creditAim;
    }

    public void setTermOfCreditingMonths(Double termOfCreditingMonths) {
        if (isPossibilityToChangeTerms()) {
            this.termOfCreditingMonths = termOfCreditingMonths;
        }
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public boolean isPossibilityOfEarlyRepayment() {
        return possibilityOfEarlyRepayment;
    }



    public boolean isPossibilityToChangeTerms() {
        return possibilityToChangeTerms;
    }


    public Double getTermOfCreditingMonths() {
        return termOfCreditingMonths;
    }

    public CreditAim getCreditAim() {
        return creditAim;
    }

}
