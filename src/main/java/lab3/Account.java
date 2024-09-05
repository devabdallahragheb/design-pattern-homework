package lab3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Account implements Promotion{
	private Customer customer;

	private String accountNumber;

	private InterestStrategy interestStrategy;
	public void setInterestStrategy(InterestStrategy strategy) {
		this.interestStrategy = strategy;
	}

	public void addInterest() {
		double interest = interestStrategy.getInterest(this.getBalance());
		addEntry(new AccountEntry(getBalance()*interest,"","",""));
	}

	private List<AccountEntry> entryList = new ArrayList<AccountEntry>();

	public Account(String accountNumber ) {
		this.accountNumber = accountNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		double balance = 0;
		for (AccountEntry entry : entryList) {
			balance += entry.getAmount();
		}
		return balance;
	}

	public void deposit(double amount) {
		AccountEntry entry = new AccountEntry(amount, "deposit", "", "");
		entryList.add(entry);
	}

	public void withdraw(double amount) {
		AccountEntry entry = new AccountEntry(-amount, "withdraw", "", "");
		entryList.add(entry);
	}

	private void addEntry(AccountEntry entry) {
		entryList.add(entry);
	}

	public void transferFunds(Account toAccount, double amount, String description) {
		AccountEntry fromEntry = new AccountEntry(-amount, description, toAccount.getAccountNumber(),
				toAccount.getCustomer().getName());
		AccountEntry toEntry = new AccountEntry(amount, description, toAccount.getAccountNumber(),
				toAccount.getCustomer().getName());
		
		entryList.add(fromEntry);
		
		toAccount.addEntry(toEntry);
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Collection<AccountEntry> getEntryList() {
		return entryList;
	}

public  InterestStrategy getInterestStrategy(){
		return  this.interestStrategy;
}

	@Override
	public double promote(double balance) {
		return interestStrategy.getInterest(balance);
	}
}
