import java.util.Scanner;

public class WeightConversion {
  public static void main(String[] args) throws Exception{
    Scanner scanner = new Scanner(System.in);

    int option;
    double num;
    double newNum =0.00;

    System.out.println("\nHello User!\n");
    System.out.println("What Conversion do you want to perform? \n 1. Kg to Lbs \n 2. Lbs to Kg\n (Choose form the options)");
    option = scanner.nextInt();

    
    
    if(option  == 1 || option == 2){
    
      System.out.print("Please type the Weight: ");
      num = scanner.nextDouble();
  
      if(option  == 1){
        newNum = num * 2.205;
        System.out.printf("\n%.3f Kg = %.3f Lbs",num,newNum);
      }
      else if(option == 2){
      newNum = num * 0.45359237;
      System.out.printf("\n%.3f Lbs = %.3f Kg",num,newNum);
      }
    }
    else{
      System.out.println("Not a valid Choice. Try again!");
    }
  
    scanner.close();
  }
}
