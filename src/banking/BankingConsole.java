package banking;

import java.util.Scanner;

public class BankingConsole {
    BankingService controller;

    BankingConsole(BankingService b) {
        this.controller = b;
    }

    public void showBalance(int acctID) {
        try {
            System.out.println("Balance is " + controller.getBalance(acctID).toString());
        } catch (AcctNotFoundExn e) {
            System.out.println("Account number not found");
        }
    }

    public void withdraw(int acctID, double amt) {
        try {
            controller.withdraw(acctID, amt);
        } catch (AcctNotFoundExn e) {
            System.out.println("Account number not found");
        }
    }

    public void loginScreen() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the Bank.  Please log in.");
        System.out.print("Enter your username: ");
        String username = keyboard.next();
        System.out.print("Enter your password: ");
        String password = keyboard.next();
        try {
            controller.login(username, password);
            System.out.println("Thanks for logging in!");
        } catch (CustNotFoundExn|LoginFailedException e) {
            System.out.println("login error, try again");
            this.loginScreen();  // reprompt the user
        }
    }
}
