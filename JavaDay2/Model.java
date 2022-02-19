import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Model {

    ICICI icici;
    BOI boi;
    SBI sbi;
    public Model() throws IOException
    {
        System.out.println("Model got executed...");
        icici=new ICICI();
        boi=new BOI();
        sbi=new SBI();
        this.initialize();
    }

    public void initialize() throws IOException
    {
        int option,option2;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int acc,tmp;
        while(true)
        {
            option=0;
            System.out.println("\n******* Menu *******");
            System.out.println("1. ICICI");
            System.out.println("2. SBI");
            System.out.println("3. BOI");
            System.out.println("4. Exit");
            System.out.print("Choose an option(1-4): ");
            option=Integer.valueOf(br.readLine());

            if(option==4) break; 

            switch(option)
            {
                case 1: 
                    System.out.println("\n******* Welcome to ICICI Bank *******");
                    System.out.println("1. Create Account");
                    System.out.println("2. Delete Account");
                    System.out.println("3. Access Account");
                    System.out.println("4. Return to previous menu");
                    System.out.print("Choose an option(1-4): ");
                    option2=Integer.valueOf(br.readLine());

                    if(option2==4) break;
                    
                    switch(option2)
                    {
                        case 1:
                        // Create Account
                        if(this.icici.createBankAccount()) System.out.println("\nAccount created successfully!");
                        else System.out.println("\nCannot create account, try again!");
                        break;

                        case 2:
                        // Delete Account
                        System.out.println("Enter account number: ");
                        acc= Integer.valueOf(br.readLine());
                        if(this.icici.deleteBankAccount(acc)) System.out.println("\nAccount deleted successfully!");
                        else System.out.println("\nCannot delete account!");
                        break;

                        case 3:
                        // Access account
                        int amount;
                        System.out.print("Enter account number: ");
                        acc= Integer.valueOf(br.readLine());
                        if(!this.icici.accountExists(acc)) break;
                        System.out.println("Transaction Type? \n1. Withdrawal \n2. Deposit ");
                        System.out.print("Choose an option (1 or 2): ");
                        tmp=Integer.valueOf(br.readLine());
                        if(tmp<=0 || tmp>=3) break;
                        System.out.print("Enter amount: ");
                        amount=Integer.valueOf(br.readLine());
                        if(tmp==1) amount=(-1)*amount;
                        if(!this.icici.processTransaction(acc, amount)) System.out.println("Unable to process transaction");
                        else System.out.println("Transaction Successful");
                        break;
                    }
                    
                    break;


                
                case 2: 
                    System.out.println("\n******* Welcome to SBI Bank *******");
                    System.out.println("1. Create Account");
                    System.out.println("2. Delete Account");
                    System.out.println("3. Access Account");
                    System.out.println("4. Return to previous menu");
                    System.out.print("Choose an option(1-4): ");
                    option2=Integer.valueOf(br.readLine());

                    if(option2==4) break;
                    
                    switch(option2)
                    {
                        case 1:
                        // Create Account
                        if(this.boi.createBankAccount()) System.out.println("\nAccount created successfully!");
                        else System.out.println("\nCannot create account, try again!");
                        break;

                        case 2:
                        // Delete Account
                        System.out.println("Enter account number: ");
                        acc= Integer.valueOf(br.readLine());
                        if(this.sbi.deleteBankAccount(acc)) System.out.println("\nAccount deleted successfully!");
                        else System.out.println("\nCannot delete account!");
                        break;

                        case 3:
                        // Access account
                        int amount;
                        System.out.print("Enter account number: ");
                        acc= Integer.valueOf(br.readLine());
                        if(!this.sbi.accountExists(acc)) break;
                        System.out.println("Transaction Type? \n1. Withdrawal \n2. Deposit ");
                        System.out.print("Choose an option (1 or 2): ");
                        tmp=Integer.valueOf(br.readLine());
                        if(tmp<=0 || tmp>=3) break;
                        System.out.print("Enter amount: ");
                        amount=Integer.valueOf(br.readLine());
                        if(tmp==1) amount=(-1)*amount;
                        if(!this.sbi.processTransaction(acc, amount)) System.out.println("Unable to process transaction");
                        else System.out.println("Transaction Successful");
                        break;
                    }
                    
                    break;
                    

                



                case 3:
                    System.out.println("\n******* Welcome to BOI Bank *******");
                    System.out.println("1. Create Account");
                    System.out.println("2. Delete Account");
                    System.out.println("3. Access Account");
                    System.out.println("4. Return to previous menu");
                    System.out.print("Choose an option(1-4): ");
                    option2=Integer.valueOf(br.readLine());

                    if(option2==4) break;
                    
                    switch(option2)
                    {
                        case 1:
                        // Create Account
                        if(this.boi.createBankAccount()) System.out.println("\nAccount created successfully!");
                        else System.out.println("\nCannot create account, try again!");
                        break;

                        case 2:
                        // Delete Account
                        System.out.println("Enter account number: ");
                        acc= Integer.valueOf(br.readLine());
                        if(this.boi.deleteBankAccount(acc)) System.out.println("\nAccount deleted successfully!");
                        else System.out.println("\nCannot delete account!");
                        break;

                        case 3:
                        // Access account
                        int amount;
                        System.out.print("Enter account number: ");
                        acc= Integer.valueOf(br.readLine());
                        if(!this.boi.accountExists(acc)) break;
                        System.out.println("Transaction Type? \n1. Withdrawal \n2. Deposit ");
                        System.out.print("Choose an option (1 or 2): ");
                        tmp=Integer.valueOf(br.readLine());
                        if(tmp<=0 || tmp>=3) break;
                        System.out.print("Enter amount: ");
                        amount=Integer.valueOf(br.readLine());
                        if(tmp==1) amount=(-1)*amount;
                        if(!this.boi.processTransaction(acc, amount)) System.out.println("Unable to process transaction");
                        else System.out.println("Transaction Successful");
                        break;
                    }
                    
                    break;

                    
                default: System.out.println("Invalid Input, try again!\n");
            }
        }

    }


}
