package lab_11.prob_6;

import org.jetbrains.annotations.NotNull;

public class Account implements Comparable<Account>{
	private int acctId;
	private double balance;
	
	public Account(int id, double startBalance) {
		if(startBalance <= 0) throw new IllegalArgumentException("Start balance must be > 0!");
		acctId = id;
		balance = startBalance;
	}
	public int getAcctId() {
		return acctId;
	}
	public double getBalance() {
		return balance;
	}


	@Override
	public int compareTo( Account o) {
		return 0;
	}
}
