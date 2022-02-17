public interface Bank 
{

    public int getTotalNumberOfAccounts();

    public boolean createBankAccount(Account account);
    public boolean deleteBankAccount(String accountNumber);

    public boolean processTransaction();

}