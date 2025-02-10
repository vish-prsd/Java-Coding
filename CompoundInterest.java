import java.util.Scanner;
public class CompoundInterest {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    double principal;
    double rate;
    int timesCompounded;
    int year;
    double amount;
    
    System.out.println("\n*** Compound Interest Calculator ***\n");
    System.out.println("The Formula is: amout = principal ( 1 + rate / timesCompounded ) ^ timesCompounded * Year");

    System.out.print("\nEnter the Principal amount: ");
    principal = scanner.nextDouble();

    System.out.print("Enter the Rate of Interest (in %): ");
    rate = scanner.nextDouble() / 100; 

    System.out.print("Enter the Number of times Compounded: ");
    timesCompounded = scanner.nextInt();

    System.out.print("Enter the number of Years: ");
    year = scanner.nextInt();


    amount = principal * Math.pow( 1 + rate / timesCompounded , timesCompounded * year);

    System.out.printf("\nThe Amout after the Principal: %.2f compounded for %d years with %.2f ROI is: $%.2f",principal, year,rate,amount);
    
    scanner.close();
  }
}





    // double a;
    // int P = 10000;
    // double r = 0.10;
    // double n = 1/4;
    // int t = 2;
    // a = P*Math.pow(1+r/n,n*t);