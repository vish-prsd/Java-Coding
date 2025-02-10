import java.util.Scanner;
public class Testing {

  public static void main(String[] args) throws Exception{
    Scanner scanner = new Scanner(System.in);

    /*String name = "Vishnu Prasad P S";
    int length = name.length();
    StringBuilder reverseName = new StringBuilder(length);
    // String reverseName = "";
    
    for(int i = length - 1; i>=0; i--){
    //  reverseName = reverseName + name.charAt(i);
    reverseName.append(name.charAt(i));
    }

    System.out.println(reverseName);
    // System.out.println(name.charAt(length-1));
    
    // System.out.println(length);

    int number = 2;
    boolean TrueorFalse = number == 2 ?  true: false;

    if(TrueorFalse){
      System.out.println("its 2");
    }
    else{
      System.out.println("its not 2");
    }*/

    
    // System.out.println("\nEnter the day!");
    // String day = scanner.nextLine().toLowerCase();
    // System.out.println(day);

    // switch(day){
    //   case "monday", "tuesday", "wednesday", "thursday", "friday" -> System.out.println("It's a weekday");
    //   case "saturday", "sunday" -> System.out.println("It's a weekend");
    //   default -> System.out.println("Not a valid day");
    // }
    
    // switch(day){
    //   case "monday" -> System.out.println("It's a weekday");
    //   case "tuesday" -> System.out.println("It's a weekday");
    //   case "wednesday" -> System.out.println("It's a weekday");
    //   case "thursday" -> System.out.println("It's a weekday");
    //   case "friday" -> System.out.println("It's a weekday");
    //   case "saturday" -> System.out.println("It's a weekend");
    //   case "sunday" -> System.out.println("It's a wekend");
    //   default -> System.out.println("Not a valid day");
    // }

    for(int i = 1; i<=10; i++){
      for(int s = 10-i; s>=1; s--){
        System.out.print(" ");
      }
      for(int j = 1; j<=i; j++){
        
        System.out.println("*");
      }
      System.out.println("");
    }

    scanner.close();
  }
}