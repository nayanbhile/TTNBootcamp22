import java.io.IOException;

public interface Bank 
{

    public int getTotalNumberOfAccounts();

    public boolean createBankAccount() throws IOException;
    public boolean deleteBankAccount(int accountNumber);
    public boolean accountExists(int accountNumber);
    public boolean processTransaction(int accountNumber,int amount) throws IOException;

}