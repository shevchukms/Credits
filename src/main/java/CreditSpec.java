public class CreditSpec {
    protected Double interestRate;
    protected Integer termOfCreditingMonths;
    protected boolean possibilityOfEarlyRepayment = false;
    protected boolean possibilityToChangeTerms = false;
    protected CreditAim creditAim;

    public CreditSpec(Double interestRate, Integer termOfCreditingMonths, CreditAim creditAim) {
        this.interestRate = interestRate;
        this.termOfCreditingMonths = termOfCreditingMonths;
        this.creditAim = creditAim;
    }

    public CreditSpec(Double interestRate, Integer termOfCreditingMonths, CreditAim creditAim, boolean possibilityOfEarlyRepayment, boolean possibilityToChangeTerms) {
        this.interestRate = interestRate;
        this.termOfCreditingMonths = termOfCreditingMonths;
        this.possibilityOfEarlyRepayment = possibilityOfEarlyRepayment;
        this.possibilityToChangeTerms = possibilityToChangeTerms;
        this.creditAim = creditAim;
    }

    public void setTermOfCreditingMonths(Integer termOfCreditingMonths) {
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


    public Integer getTermOfCreditingMonths() {
        return termOfCreditingMonths;
    }

    public CreditAim getCreditAim() {
        return creditAim;
    }

}
