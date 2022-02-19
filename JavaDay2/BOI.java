import java.util.Date;
import java.util.LinkedHashMap;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;

public class BOI implements Bank
{

    public final String bankName="BOI";
    public final float rateOfInterest=7;
    private int lastGeneratedAccountNumber=0;
    int transactionNumber=0;
    private LinkedHashMap<Integer,Account> accountList=null;

    public BOI()
    {
        lastGeneratedAccountNumber=12331211;
        transactionNumber=45678;
        accountList=new LinkedHashMap<>();
    }

    private int generateAccountNumber()
    {
        return lastGeneratedAccountNumber++;
    }

    @Override
    public boolean createBankAccount() throws IOException
    {
        String name;
        int tmp;
        int accountNumber, accountBalance;

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);

        AccountType accountType=null;
        System.out.println("\n******* Create Account *******");
        
        System.out.print("Full Name: ");
        name=br.readLine();
        
        System.out.println("Account Type? \n1. Savings \n2. Current ");
        System.out.print("Choose an option (1 or 2): ");
        tmp=Integer.valueOf(br.readLine());
        if(tmp<=0 || tmp>=3) return false;
        if(tmp==1) accountType=AccountType.SAVINGS;
        if(tmp==2) accountType=AccountType.CURRENT;
        if (accountType==null) return false;

        accountNumber=0;

        if(accountType==AccountType.SAVINGS)
        {
            System.out.println("Enter Deposit Amount: ");
            accountBalance=Integer.valueOf(br.readLine());
        }
        else
        {
            accountBalance=0;
        }

        Account boiAccount=new Account("BOI", accountType, accountNumber, name, accountBalance);

        if(!boiAccount.setAccountNumber(this.generateAccountNumber()))
        {
            System.out.println("Cannot update account number");
            return false;
        }
        this.accountList.put(boiAccount.getAccountNumber(), boiAccount);
        System.out.println("\n"+this.accountList.get(boiAccount.getAccountNumber()));
        return true;
    }

    @Override
    public boolean deleteBankAccount(int accountNumber) 
    {
        if(this.accountList.containsKey(accountNumber))
        {
            this.accountList.remove(accountNumber);
            return true;
        }
        else
        {
            System.out.println("Invalid account number: "+accountNumber+"\nCannot delete the account");
            return false;
        }
    }

    @Override
    public int getTotalNumberOfAccounts() 
    {
        return this.accountList.size();
    }

    @Override
    public boolean processTransaction(int accountNumber, int amount) throws IOException
    {
        Account account= this.accountList.get(accountNumber);
        File file=new File("transactions//boiTransactions.txt");
        SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        FileWriter fileWriter=new FileWriter(file,true);
        if(!file.exists())
        {
            System.out.println("Missing transaction file!");
            fileWriter.close();
            return false;
        }
        StringBuffer sb=new StringBuffer();
        int beforeTransactionAccountBalance=account.getAccountBalance();
        int afterTransactionAccountBalance=0;
        String transactionType="";
        if(amount>0)
        {
            afterTransactionAccountBalance=beforeTransactionAccountBalance+amount;
            transactionType="Amount deposited!";
        }
        else
        {
            transactionType="Amount withdrawn!";
            afterTransactionAccountBalance=beforeTransactionAccountBalance+amount;
            if(afterTransactionAccountBalance<0)
            {
                afterTransactionAccountBalance=beforeTransactionAccountBalance;
                System.out.println("Cannot process the transaction. Insufficient account balance!");

                sb.append("\nTransaction ID: "+this.transactionNumber);
                sb.append("\nTime of Transaction: "+(sdf.format(new Date())));
                sb.append("\nAccount Number: "+account.getAccountNumber());
                sb.append("\n"+transactionType);
                sb.append("\nBalance before transaction: "+beforeTransactionAccountBalance);
                sb.append("\nBalance after transaction: "+afterTransactionAccountBalance);
                sb.append("\nTransaction status: FAILED\n");
                
                fileWriter.write(sb.toString());
                fileWriter.close();

                System.out.print("\n***** Transaction Failed *****"+sb.toString());
                return false;
            }
            else
            {
                afterTransactionAccountBalance=beforeTransactionAccountBalance+amount;
            }
        }
        this.accountList.get(accountNumber).setAccountBalance(afterTransactionAccountBalance);
        this.transactionNumber++;
        // generating transaction string
        
        sb.append("\nTransaction ID: "+this.transactionNumber);
        sb.append("\nTime of Transaction: "+(sdf.format(new Date())));
        sb.append("\nAccount Number: "+account.getAccountNumber());
        sb.append("\n"+transactionType);
        sb.append("\nBalance before transaction: "+beforeTransactionAccountBalance);
        sb.append("\nBalance after transaction: "+afterTransactionAccountBalance);
        sb.append("\nTransaction status: SUCCESSFUL\n");
        fileWriter.write(sb.toString());
        fileWriter.close();

        System.out.print("\n***** Transaction Successful *****"+sb.toString());
        return true;
    }
    
    @Override
    public boolean accountExists(int accountNumber) {
        return this.accountList.containsKey(accountNumber);
    }
    
}
