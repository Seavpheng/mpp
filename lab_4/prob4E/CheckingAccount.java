package lab_4.prob4E;

public class CheckingAccount extends Account{
    private double balance;
    private double monthlyFee;
    private String acctId;

    public CheckingAccount(String accId, double fee, double startBalance){
        this.acctId = accId;
        this.monthlyFee = fee;
        this.balance = startBalance;
    }

    public String getAccountID(){
        return acctId;
    }

    public double getBalance(){
        return balance;
    }

    public double computeUpdatedBalance(){
        return balance  - monthlyFee;
    }
}
