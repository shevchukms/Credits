public class Credit {
    protected boolean isActive = true;
    protected Double valueOfCredit;
    protected Double valueOfPayedCreditedMoney=0.0;
    protected CreditSpec creditSpec;
    protected Double amountOfPaymentPerMonth;
    protected Client client;

    public Credit(Double valueOfCredit, CreditSpec creditSpec) {
        this.valueOfCredit = valueOfCredit;
        this.creditSpec = creditSpec;
        calculateAmountOfPaymentPerMonth();
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        if(this.client==null){
        this.client = client;}
        else {
            System.out.println("This Credit already has the client");
        }
    }

    public Double calculateTheEntireAamountToPayForLoan(){
        return valueOfCredit-valueOfPayedCreditedMoney+valueOfCredit*(creditSpec.getInterestRate()/100)/12;
    }


    public void payMoney(Double money) {
        if (this.isActive) {
            valueOfPayedCreditedMoney += money;
            if (valueOfPayedCreditedMoney >= valueOfCredit) {
                isActive = false;
            } else {
                calculateAmountOfPaymentPerMonth();
            }
        }
    }

    public void calculateAmountOfPaymentPerMonth() {
        this.amountOfPaymentPerMonth = valueOfCredit / creditSpec.getTermOfCreditingMonths() + valueOfCredit * (creditSpec.getInterestRate() / 100) / 12;
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
                ", Term Of Crediting =" + String.valueOf(creditSpec.getTermOfCreditingMonths()) +
                ", Possibility Of Early Repayment =" + String.valueOf(creditSpec.isPossibilityOfEarlyRepayment()) +
                ", Possibility To Make Longer Terms =" + String.valueOf(creditSpec.isPossibilityToChangeTerms()) +
                ", credit aim =" + String.valueOf(creditSpec.getCreditAim()) +
                '}';
    }
}
