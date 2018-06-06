import java.util.*;
 
public class Palindrome
{
   public static void main(String args[])
   {
      String reverse = "";

      int n;
      Scanner in = new Scanner(System.in);
      n = in.nextInt();
 
      System.out.println("Enter a number to check if it is a palindrome");
      int[] original = new int[n];
      // original = in.nextLine();

      for(int j = 0 ;j<n;j++) {

         original = in.nextInt();
      }
 
      int length = original.length;
 
      for ( int i = length - 1; i >= 0; i-- )
         reverse = reverse + original.charAt(i);
 
      if (original.equals(reverse))
         System.out.println("Entered string is a palindrome.");
      else
         System.out.println("Entered string is not a palindrome.");
 
   }
}	