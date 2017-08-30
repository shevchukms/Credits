public class CreditSpec {
    protected Double interestRate;
    protected Double termOfCrediting;
    protected boolean possibilityOfEarlyRepayment = false;
    protected boolean possibilityToChangeTerms = false;
    protected CreditAim creditAim;

    public CreditSpec(Double interestRate, Double termOfCrediting, CreditAim creditAim) {
        this.interestRate = interestRate;
        this.termOfCrediting = termOfCrediting;
        this.creditAim = creditAim;
    }

    public CreditSpec(Double interestRate, Double termOfCrediting, CreditAim creditAim, boolean possibilityOfEarlyRepayment, boolean possibilityToChangeTerms) {
        this.interestRate = interestRate;
        this.termOfCrediting = termOfCrediting;
        this.possibilityOfEarlyRepayment = possibilityOfEarlyRepayment;
        this.possibilityToChangeTerms = possibilityToChangeTerms;
        this.creditAim = creditAim;
    }

    public void setTermOfCrediting(Double termOfCrediting) {
        if (isPossibilityToChangeTerms()) {
            this.termOfCrediting = termOfCrediting;
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


    public Double getTermOfCrediting() {
        return termOfCrediting;
    }

    public CreditAim getCreditAim() {
        return creditAim;
    }

}
