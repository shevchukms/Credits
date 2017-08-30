/**
 * Created by Mykola on 30.08.2017.
 */
public class CreditSpec {
    protected  Double interestRate;
    protected  Double termOfCrediting;
    protected  CreditAim creditAim;

    public CreditSpec(Double interestRate, Double termOfCrediting, CreditAim creditAim) {
        this.interestRate = interestRate;
        this.termOfCrediting = termOfCrediting;
        this.creditAim = creditAim;
    }

    public Double getInterestRate() {
        return interestRate;
    }


    public Double getTermOfCrediting() {
        return termOfCrediting;
    }

    public CreditAim getCreditAim() {
        return creditAim;
    }

}
