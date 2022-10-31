package lab_4.prob4E;

public class SavingsAccount extends Account {
    private double balance;
    private double interestRate;
    private String acctId;
    public SavingsAccount(String acctId, double interestRate, double startBalance){
        this.acctId = acctId;
        this.interestRate = interestRate;
        this.balance = startBalance;
    }

    @Override
    public String getAccountID(){
        return acctId;
    }

    public double getBalance(){
        return balance;
    }

    public double computeUpdatedBalance(){
        return  balance + (interestRate * balance);
    }
}
