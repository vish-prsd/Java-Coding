import java.util.InputMismatchException;
import java.util.Scanner;

public class Banking {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    double balance = 10000;

    System.out.println("\nWelcome to the Bank!\nHow can we serve you today?");
    boolean quit = false;
    int userInput = 0;
    do {
      System.out.println("\n1. Show Balance\n2. Withdraw Amount\n3. Deposit Amount\n4. Quit");
      try {
        userInput = scanner.nextInt();
        switch (userInput) {
          case 1 -> System.out.printf("Your available balance is: $%.2f%n", balance);
          case 2 -> balance = withdrawal(balance, scanner);
          case 3 -> balance = deposition(balance, scanner);
          case 4 -> quit = true;
          default -> System.out.println("Please choose the correct option!");
        }
      } catch (InputMismatchException e) {
        System.out.println("Invalid input. Please enter a number from the options.");
        scanner.next(); // Clear the invalid input
      }
    } while (!quit);
    System.out.println("Thank you! Have a great day ahead :)");
    scanner.close();
  }

  public static double withdrawal(double balance, Scanner scanner) {
    System.out.print("Enter amount to withdraw: ");
    double amount = scanner.nextDouble();
    if (amount > balance) {
      System.out.println("Insufficient balance!");
    } else {
      balance -= amount;
      System.out.printf("You have withdrawn $%.2f. Your new balance is $%.2f%n", amount, balance);
    }
    return balance;
  }

  public static double deposition(double balance, Scanner scanner) {
    System.out.print("Enter amount to deposit: ");
    double amount = scanner.nextDouble();
    balance += amount;
    System.out.printf("You have deposited $%.2f. Your new balance is $%.2f%n", amount, balance);
    return balance;
  }
}