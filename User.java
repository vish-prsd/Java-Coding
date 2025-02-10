public class User {

  String name;
  int age;
  String Email;

  User(){
    this.name = "user";
    this.age = 0;
    this.Email = "Not provided!";
  }

  User(String name, int age){
    this.name = name;
    this.age = age;
    this.Email = "Not provided!";
  }

  User(String name, int age, String Email){
    this.name = name;
    this.age = age;
    this.Email = Email;
  }

  public void printUser(){
    System.out.println("\nHi " + this.name + " You are " + this.age + " years old and your Email is " + this.Email + "\n"); 
  }
}