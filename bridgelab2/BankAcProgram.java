package bridgelab2;

import java.util.Scanner;

public class BankAcProgram {
    private double balance;
     static Scanner sc= new Scanner(System.in);
	public BankAcProgram(double initialBalance) {
            balance = initialBalance;
        }

        public void debit(double balance) {
            System.out.println("Enter amount to withdraw");
            double withdraw = sc.nextDouble();

            if (withdraw > balance)
                System.out.println("Withdraw exceeds the balance please enter correct amount");
            else
                balance = balance - withdraw;
            System.out.println("Remaining balance is " + balance);

        }

        public void deposit(double depositAmount) {
            balance += depositAmount;
        }

        public static void main(String[] args) {

            System.out.println("Enter the balance to mention in the account");
            BankAcProgram account = new BankAcProgram(sc.nextDouble());
            account.debit(account.balance);
        }
    }



