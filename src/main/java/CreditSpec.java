public class CreditSpec {
    protected Double interestRate;
    protected Double termOfCrediting;
    protected boolean possibilityOfEarlyRepayment = false;
    protected boolean possibilityToMakeLongerTerms = false;
    protected CreditAim creditAim;

    public CreditSpec(Double interestRate, Double termOfCrediting, CreditAim creditAim) {
        this.interestRate = interestRate;
        this.termOfCrediting = termOfCrediting;
        this.creditAim = creditAim;
    }

    public CreditSpec(Double interestRate, Double termOfCrediting, CreditAim creditAim, boolean possibilityOfEarlyRepayment, boolean possibilityToMakeLongerTerms) {
        this.interestRate = interestRate;
        this.termOfCrediting = termOfCrediting;
        this.possibilityOfEarlyRepayment = possibilityOfEarlyRepayment;
        this.possibilityToMakeLongerTerms = possibilityToMakeLongerTerms;
        this.creditAim = creditAim;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public boolean isPossibilityOfEarlyRepayment() {
        return possibilityOfEarlyRepayment;
    }

    public void setPossibilityOfEarlyRepayment(boolean possibilityOfEarlyRepayment) {
        this.possibilityOfEarlyRepayment = possibilityOfEarlyRepayment;
    }

    public boolean isPossibilityToMakeLongerTerms() {
        return possibilityToMakeLongerTerms;
    }

    public void setPossibilityToMakeLongerTerms(boolean possibilityToMakeLongerTerms) {
        this.possibilityToMakeLongerTerms = possibilityToMakeLongerTerms;
    }

    public Double getTermOfCrediting() {
        return termOfCrediting;
    }

    public CreditAim getCreditAim() {
        return creditAim;
    }

}
