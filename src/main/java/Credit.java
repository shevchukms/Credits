
public class Credit {
    protected Double valueOfCredit;
    protected CreditSpec creditSpec;

    public Credit(Double valueOfCredit, CreditSpec creditSpec) {
        this.valueOfCredit = valueOfCredit;
        this.creditSpec = creditSpec;
    }

    public Double getValueOfCredit() {
        return valueOfCredit;
    }

    public CreditSpec getCreditSpec() {
        return creditSpec;
    }

    @Override
    public String toString() {
        return "Credit{" +
                "value Of Credit=" + valueOfCredit +
                ", credit interest rate =" + String.valueOf(creditSpec.getInterestRate()) +
                ", credit interest rate =" + String.valueOf(creditSpec.getTermOfCrediting()) +
                ", credit interest rate =" + String.valueOf(creditSpec.getCreditAim()) +
                '}';
    }
}
