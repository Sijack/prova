

/**
A bank account has a balance that can be changed by
deposits and withdrawals.
*/
public class BankAccount implements Cloneable
{
	/**
	Constructs a bank account with a zero balance
	@param anAccountNumber the account number for this account
	*/
	public BankAccount(int anAccountNumber)
	{
		accountNumber = anAccountNumber;
		balance = 0;
	}
	
	public BankAccount(int initialBalance, String customerName, int accountNumber)
	{
		if (initialBalance < 0) {
			throw new InitialBalanceException();
		}
		this.balance=initialBalance;
		this.customerName=customerName;
		this.accountNumber=accountNumber;
	}

	/**
	Constructs a bank account with a given balance
	@param anAccountNumber the account number for this account
	@param initialBalance the initial balance
	 */
	public BankAccount(int anAccountNumber, int initialBalance)
	{
		if (initialBalance < 0) {
			throw new NegativeAmountException();
		}
		accountNumber = anAccountNumber;
		balance = initialBalance;
	}

	/**
	Gets the account number of this bank account.
	@return the account number
	*/
	public int getAccountNumber()
	{
		return accountNumber;
	}

	/**
	Deposits money into the bank account.
	@param amount the amount to deposit
	*/
	public void deposit(int amount)
	{
		if (amount < 0) {
			throw new ExcedentAmountException();
		}
		int newBalance = balance + amount;
		balance = newBalance;
	}

	/**
	Withdraws money from the bank account.
	@param amount the amount to withdraw
	*/
	public void withdraw(int amount)
	{
		if (amount < 0 || amount > balance) {
			throw new IllegalArgumentException("Errore, importo non valido");
		}
		int newBalance = balance - amount;
		balance = newBalance;
	}

	/**
	Gets the current balance of the bank account.
	@return the current balance
	*/
	public int getBalance()
	{
		return balance;
	}
	
	public Object clone(){
		try {
			return super.clone();
		}
		catch(CloneNotSupportedException e){
			return null;
		}
	}
	
	public String toString() {
		return getClass().getName() + "[balance=" + balance + ", cliente=" + customerName + ", numeroConto=" +accountNumber+"]";
	}

	private int accountNumber;
	private String customerName;
	private int balance;
}