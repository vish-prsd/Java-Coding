import java.util.Scanner;

public class twoDArray {
  public static void main(String[] args) throws Exception{
    Scanner scanner = new Scanner(System.in);


    String[][] students = {{"vishnu","BCA","2023"},
                           {"Saloni","BCom","2023"},
                           {"Monish","BCA","2023"}};
    // for(String[] student: students){
    //     for(String s: student){
    //       System.out.println(s);
    //     }
    // }

    /*System.out.print("Enter the location you want to access\n->row");
    int row = scanner.nextInt();scanner.nextLine(); 
    System.out.print("column:");
    int column = scanner.nextInt();scanner.nextLine(); 
    System.out.println(students[row][column]);
    */

    for(int i = 0; i<students.length; i++){
      String[] student = students[i];
      for(int j = 0; j<student.length; j++){
        System.out.print(student[j] + " ");
      }
      System.out.print("\n");
    }
    System.out.println("\n");
    for(int i = 0; i<students.length; i++){
      for(int j = 0; j<students[i].length; j++){
        System.out.print(students[i][j] + " ");
      }
      System.out.print("\n");
    }

    String[] testing = {"1","2","3","4"};
      System.out.println(String.join(" | ",testing));





    scanner.close();
  }
}
