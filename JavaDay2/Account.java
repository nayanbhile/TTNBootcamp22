public class Account 
{
    String bankName;
    AccountType accountType;
    int accountNumber;
    String accountHandler;
    int accountBalance;
    String pin;


    public Account(String bankName, AccountType accountType, int accountNumber, String accountHandler, int accountBalance)
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
    public boolean setAccountNumber(Integer accountNumber)
    {
        if(this.accountNumber==0)
        {
            this.accountNumber=accountNumber;
            return true;
        } 
        return false;
    }

    public int getAccountNumber()
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

    public boolean equals(Account acc) {
        try
        {
            return this.accountNumber==acc.getAccountNumber();
        }
        catch(Exception e) 
        {   
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public String toString() {
        return "********Account Details********\nAccountNumber = "
        + accountNumber  + "\nAccountHandler = " + accountHandler  + "\nAccountType = " + accountType + "\nBankName = " + bankName + "\nAccountBalance = " + accountBalance;
    }

    
}
