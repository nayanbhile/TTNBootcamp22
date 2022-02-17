import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Model {

    ICICI icici;
    public Model()
    {
        System.out.println("Model got executed...");
        icici=new ICICI();
        this.initialize();
    }

    public void initialize()
    {
        int option,option2;
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            option=0;
            System.out.println("\n******* Menu *******");
            System.out.println("1. ICICI");
            System.out.println("2. SBI");
            System.out.println("3. BOI");
            System.out.println("4. Exit");
            System.out.print("Choose an option(1-4): ");
            option=sc.nextInt();

            if(option==4) break; 

            switch(option)
            {
                case 1: 
                    System.out.println("\n******* Welcome to ICICI Bank *******");
                    System.out.println("1. Create Account");
                    System.out.println("2. Delete Account");
                    System.out.println("3. Update Account");
                    System.out.println("4. Access Account");
                    System.out.println("5. Return to previous menu");
                    System.out.print("Choose an option(1-5): ");
                    option2=sc.nextInt(); 

                    if(option2==5) break;
                    
                    switch(option2)
                    {
                        case 1:
                        String name;
                        int tmp;
                        int accountNumber, accountBalance;

                        AccountType accountType=null;
                        System.out.println("\n******* Create Account *******");
                        
                        System.out.println("Full Name: ");
                        name=sc.nextLine();
                        
                        System.out.println("Account Type? \n 1. Savings \n2. Current ");
                        tmp=sc.nextInt();
                        if(tmp<=0 || tmp>=3) break;
                        if(tmp==1) accountType=AccountType.SAVINGS;
                        if(tmp==2) accountType=AccountType.CURRENT;
                        if (accountType==null) break;

                        accountNumber=icici.generateAccountNumber();

                        if(accountType==AccountType.SAVINGS)
                        {
                            System.out.println("Enter Deposit Amount: ");
                            accountBalance=sc.nextInt();
                        }
                        else
                        {
                            accountBalance=0;
                        }

                        Account iciciAccount=new Account("ICICI", accountType, accountNumber, name, accountBalance);
                        this.icici.createBankAccount(iciciAccount);
                        break;

                        case 2:
                        // Delete Account
                        break;

                        case 3:
                        // update account
                        break;

                        case 4:
                        // Access account
                    }
                    





                    break;
                
                case 2: 
                    System.out.println("\n******* Welcome to SBI *******");
                    
                    break;
                
                default: System.out.println("Invalid Input, try again!\n");
            }
        }

    }


}
