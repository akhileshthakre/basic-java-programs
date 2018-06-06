import java.util.Scanner; // I use scanner because it's command line.

public class Login {

    
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String username;
    String password;

    String user;
    String pass;

    System.out.println("Log in:");
    System.out.println("username: ");
    String a = input.next();

    System.out.println("password: ");
    String b = input.next();
    System.out.println("Congrats you creatre ur login ID");
    System.out.println();
    System.out.println("Now enter your login credential to Login");
    System.out.println("username: ");
    user = input.next();
    System.out.println("password: ");
    pass = input.next();


    //users check = new users(username, password);

    if(user.equals(a) && pass.equals(b)) {
        System.out.println("You are logged in");
    }else {
        System.out.println("Invalid user name");
    }



}

} 