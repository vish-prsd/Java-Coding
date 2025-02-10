public class Constructors {
  public static void main(String[] args)throws Exception {
    User user1 = new User();
    User user2 = new User("Vishnu", 20);
    User user3 = new User("Saloni",23,"salonichonadamma22@gamil.com");

    user1.printUser();
    user2.printUser();
    user3.printUser();
  }
}
