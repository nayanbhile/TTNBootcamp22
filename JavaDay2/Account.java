public class Account 
{
    String bankName;
    AccountType accountType;
    String accountNumber;
    String accountHandler;
    int accountBalance;


    public Account(String bankName, AccountType accountType, String accountNumber, String accountHandler, int accountBalance)
    {
        this.bankName= bankName;
        this.accountType= accountType;
        this.accountNumber= accountNumber;
        this.accountHandler= accountHandler;
        this.accountBalance= accountBalance;
    }

    
    public String getBankName()
    {
        return this.bankName;
    }
    public AccountType getAccountType()
    {
        return this.accountType;
    }
    public String getAccountNumber()
    {
        return this.accountNumber;
    }
    public String getAccountHandler()
    {
        return this.accountHandler;
    }
    public void setAccountBalance(int accountBalance)
    {
        this.accountBalance=accountBalance;
    }
    public int getAccountBalance()
    {
        return this.accountBalance;
    }


    @Override
    public String toString() {
        return "********Account Details********\nAccountNumber = "
        + accountNumber  + "\nAccountHandler = " + accountHandler  + "\nAccountType = " + accountType + "\nBankName = " + bankName + "\nAccountBalance = " + accountBalance;
    }

    
}
