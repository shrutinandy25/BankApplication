
import java.util.Scanner;

public class BankApp {

        public static void main(String[] args)
        {
            BankAccount obj = new BankAccount("Shruti Nandy", 123456789,50.0,"5306365329","shrutinandy25@gmail.com");
            obj.otherOption();
        }
    }
    class BankAccount
    {

        String  userName;
        long userAccountNo;
        double balance;
        String phoneNo;
        String emailId;

        BankAccount(String cname, long cId, double cbalance, String cphoneNo, String cemailId)
        {
            userName = cname;
            userAccountNo = cId;
            balance = cbalance;
            phoneNo = cphoneNo;
            emailId = cemailId;

        }

        public void accountBalance()
        {
            System.out.println("In Shruti's account the balance is " + balance );
        }


        public void deposit( double amount)
        {
            if(amount != 0)
            {
                balance = balance + amount;
                System.out.println("Total balance after the deposit" + balance);
            }
        }

        public void withdrawal(double amount)
        {
            if(amount > balance)
            {
                System.out.println("Transfer Can't happen");
            }
            else if(amount != 0)
            {
                balance = balance - amount;
                System.out.println("Total balance after withdrawal " + balance);
            }

        }

        public void otherOption()
        {
            char option = '\0';
            Scanner scanner = new Scanner(System.in);
            System.out.println("A. Check balance");
            System.out.println("B. Deposit money");
            System.out.println("C. Withdraw money");
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
                        System.out.println("Enter the amount from the user");
                        double amount = scanner.nextDouble();
                        deposit(amount);
                        System.out.println("\n");
                        break;

                    case 'C':
                        System.out.println("Enter the amount from the user");
                        double amount1 = scanner.nextDouble();
                        withdrawal(amount1);
                        System.out.println("\n");
                        break;


                }
            } while (option != 'E');
            System.out.println("You have selected to Exit \n Thank You for Using our service");
        }

    }



