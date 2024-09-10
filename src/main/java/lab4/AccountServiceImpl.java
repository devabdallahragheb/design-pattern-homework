package lab4;
import java.util.Collection;

public class AccountServiceImpl implements AccountService {
	private AccountDAO accountDAO;
	
	public AccountServiceImpl(){
		accountDAO = new AccountDAOImpl();
	}
	public AccountServiceImpl(boolean isTestEnvironment) {
		this.accountDAO = DAOFactory.getAccountDAO(isTestEnvironment);
	}

	public Account createAccount(String accountNumber, String customerName) {
		Account account = new Account(accountNumber);
		Customer customer = new Customer(customerName);
		account.setCustomer(customer);
		
		accountDAO.saveAccount(account);
		
		return account;
	}

	public void deposit(String accountNumber, double amount) {
		try {
			Account account = accountDAO.loadAccount(accountNumber);
			account.deposit(amount);

			accountDAO.updateAccount(account);
		}catch ( Exception e){
			System.out.println("print"+e.getMessage());
		}

	}

	public Account getAccount(String accountNumber) {
		Account account = accountDAO.loadAccount(accountNumber);
		return account;
	}

	public Collection<Account> getAllAccounts() {
		return accountDAO.getAccounts();
	}

	public void withdraw(String accountNumber, double amount) {

		try{
		Account account = accountDAO.loadAccount(accountNumber);
		account.withdraw(amount);
		accountDAO.updateAccount(account);
		}catch ( Exception e){
			System.out.println("print"+e.getMessage());
		}
	}



	public void transferFunds(String fromAccountNumber, String toAccountNumber, double amount, String description) {
		try{
		Account fromAccount = accountDAO.loadAccount(fromAccountNumber);
		Account toAccount = accountDAO.loadAccount(toAccountNumber);
		fromAccount.transferFunds(toAccount, amount, description);
		accountDAO.updateAccount(fromAccount);
		accountDAO.updateAccount(toAccount);
		}catch ( Exception e){
			System.out.println("print"+e.getMessage());
		}
	}
}
