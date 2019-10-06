
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class BankApp {

        public static void main(String[] args)              //Main Function
        {
            //Creates object of class BankAccount
            BankAccount obj = new BankAccount("Shruti Nandy", 123456789, "Checking", 50.0,"5306365329","shrutinandy25@gmail.com");

            obj.otherOption();//Object for the Other Option


        }
    }
    //---------------------------------------------------------------------------------------
    class BankAccount
    {

        String  userName;                   //Customer Name
        long userAccountNo;                 //Customer Account Number
        String userAccountType;             // Customer Account Type
        double balance;                     //Customer Account Balance
        String phoneNo;                     //Customer Phone Number
        String emailId;                     //Customer Email Id
        int depositCounter;                 // Defining the deposit counter

        BankAccount(String cname, long cId, String cChecking, double cbalance, String cphoneNo, String cemailId)
        {
            userName = cname;
            userAccountNo = cId;
            userAccountType = cChecking;            //Creating Constructor for all the attributes
            balance = cbalance;
            phoneNo = cphoneNo;
            emailId = cemailId;
        }
        //-----------------------------------------------------------------------------------------
        //Class for all transaction

        class allTransactions {
            char typeOfTransaction;
            double amount;
            double balance;
            ArrayList anyTransaction = new ArrayList();

            allTransactions(char newTypeOfTransaction, double newAmount, double newBalance) //constructor for class allTransaction
            {
                char typeOfTransaction = newTypeOfTransaction;
                double amount = newAmount;
                double balance = newBalance;
            }
        }
            //----------------------------------------------------------------------------------------------------------------

        public void accountBalance()                    //Method for Showing the account balance
        {   Calendar cal = Calendar.getInstance();
            System.out.println("Account balance is " + balance );
            System.out.println("Customer Name" + userName);
            System.out.println("Account Type" + userAccountType);
            System.out.println(cal.getTime());
        }


        public void deposit(double amount)//Method for Depositing the money
        {
            if(depositCounter!=3)
            {
                if (amount != 0)
                {

                    if (amount <= 500 && amount >= 50)          //Deposit Amount to be <50 and >500
                    {
                        balance = balance + amount;
                        System.out.println("You have deposited: " + amount);
                        System.out.println("Total Balance: " + balance);
                        System.out.println("Deposit # : " + depositCounter);
                        depositCounter++;


                    } else if (amount < 50)
                    {
                        System.out.println("Minimum amount for the transaction is 50");
                    } else if (amount > 500)
                    {
                        System.out.println("Maximum amount for the single transaction is reached");
                    }
                }

            }

            else
               {
                   System.out.println("You have reached the limit for today");  //Limit for the day Counter working here
                }

        }

//-------------------------------------------------------------------------------------------------------------

        public double withdrawal(double amount)           //withdrawal function
        {
            if (amount <= 1000) {                           // Withdrawal amount to be equal <=1000
                balance = balance - amount;

                System.out.println("The amount withdrawal is " + amount);
            } else {
                System.out.println("The withdrawal amount is more than 1000 limit ");
            }
            System.out.println("The remaining balance is: " + balance);
            return amount;
        }

//-----------------------------------------------------------------------------------------------------------
        public void otherOption()               //otherOption: Menu
        {
            char option = '\0';
            Scanner scanner = new Scanner(System.in);
            System.out.println("A. Check balance");
            System.out.println("B. Deposit money");
            System.out.println("C. Withdraw money");
            System.out.println("D. Account Information");
            System.out.println("E. Exit");

            do {

                System.out.println("Enter an option");
                option = scanner.next().charAt(0);

                switch (option) {
                    case 'A':
                        System.out.println("Balance " + balance);
                        System.out.println("\n");
                        break;

                    case 'B':
                        System.out.println("Enter the amount to be deposited from the user");
                        double amount = scanner.nextDouble();
                        deposit(amount);
                        System.out.println("\n");
                        break;

                    case 'C':
                        System.out.println("Enter the amount to be withdrawal from the user");
                        double amount1 = scanner.nextDouble();
                        withdrawal(amount1);
                        System.out.println("\n");
                        break;

                    case 'D':
                        System.out.println("Show Balance and Account information");
                        System.out.println("-------------------------------------");
                        accountBalance();
                        System.out.println("\n");
                        break;


                }
            } while (option != 'E');
            System.out.println("You have selected to Exit \n Thank You for Using our service");
        }

    }




