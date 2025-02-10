import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Hello, World!");

        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();

        System.out.println("Good Morning "+ name+'!' );

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Are You a student?: ");
        String Student = scanner.nextLine();

        boolean isStudent = Student.equalsIgnoreCase("Yes");
        
        // if(Student == "yes" || Student =="Yes"){
        //     isStudent = true;
        // }
        // else if(Student == "no" || Student =="No"){
        //     isStudent = false;
        // }
        
        System.out.print("What is your GPA?: ");
        double GPA = scanner.nextDouble();

        System.out.println("");

        System.out.println("Your age is: "+ age+'.');
        System.out.println("You have gained: "+GPA+"GPA");

        if(isStudent){
            System.out.println("You are a Student!");
        }
        else{
            System.out.println("You are not a Student!");
        }
            */

        
        String[] names = {"vishnu","saloni","chocos","sera"};
        //for printing an array
        /*for(int i = 0; i<4; i++){
            System.out.print(" "+names[i]);
        }
        System.out.println("\n"+names);
        */

        for(String name: names){
            System.out.println(name);
        }
        
        int n = 0;
        String[] fruits;
        System.out.print("Enter the number of elements:");
        n = scanner.nextInt(); scanner.nextLine();
        fruits = new String[n];
        System.out.println(fruits.length);

        for(int i = 0; i<fruits.length; i++)
        {
            System.out.print("Enter the name of the fruit:");
            String fruit = scanner.nextLine();
            fruits[i] = fruit;
        }

        for(String f : fruits){
            System.out.println(f);
        }
        scanner.close();
    }
}
