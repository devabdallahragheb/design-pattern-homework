package lab3;

public class Application {
	public static void main(String[] args) {
		AccountService accountService = new AccountServiceImpl();
		InterestStrategy saveingP1 = new Promotion1(new CheckingsInterestStrategy());
		saveingP1=new Promotion2(saveingP1);
		saveingP1=new Promotion3(saveingP1);
		//InterestStrategy savingP2 = new Promotion2(new CheckingsInterestStrategy());
		// create 2 accounts;
		accountService.createAccount("1263862", "Frank Brown",saveingP1);
		accountService.createAccount("4253892", "John Doe",saveingP1);

		// use account 1;
		accountService.deposit("1263862", 240);
		accountService.deposit("1263862", 529);
		accountService.withdraw("1263862", 230);
		// use account 2;
		accountService.deposit("4253892", 12450);
		accountService.transferFunds("4253892", "1263862", 100, "payment of invoice 10232");
		// show balances
accountService.addInterest();


		for (Account account : accountService.getAllAccounts()) {
			Customer customer = account.getCustomer();
			System.out.println("Statement for Account: " + account.getAccountNumber());
			System.out.println("Account Holder: " + customer.getName());
			
			System.out.println("-Date-------------------------" 
					+ "-Description------------------" 
					+ "-Amount-------------");
			
			for (AccountEntry entry : account.getEntryList()) {
				System.out.printf("%30s%30s%20.2f\n", 
						entry.getDate().toString(), 
						entry.getDescription(),
						entry.getAmount());
			}
			
			System.out.println("----------------------------------------" + "----------------------------------------");
			System.out.printf("%30s%30s%20.2f\n\n", "", "Current Balance:", account.getBalance());
		}
	}

}
