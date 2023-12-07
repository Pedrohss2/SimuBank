package application;

import model.entities.Account;
import model.exceptions.ErrorsAccountException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("----- Welcome to the bank SimuBank -----");
        System.out.println("Enter account data: ");

        try {
            System.out.println("Number : ");
            int numberOfAccount = sc.nextInt();

            System.out.println("Holder: ");
            String holder = sc.next();

            System.out.println("Initial balance: ");
            double initialBalance = sc.nextDouble();

            System.out.println("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(numberOfAccount, holder, initialBalance, withdrawLimit);

            System.out.println("Entre amount for withdraw: ");
            double withdraw = sc.nextDouble();

            account.withdraw(withdraw);

            System.out.print("New balance: ");
            System.out.println(account.getBalance());
        }
        catch (ErrorsAccountException error) {
            System.out.println(error.getMessage());
        }
        catch (RuntimeException error) {
            System.out.println("Unexpected error.");
        }

        sc.close();
    }
}
