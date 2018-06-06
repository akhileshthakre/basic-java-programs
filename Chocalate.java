import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Chocalate {

    static int solve(int n, int[] s, int d, int m){

        for(int i = 0 ; i<s.length ; i++) {
            for(int j = i ; j< s.length; j++) {

                
            }
        }

       //  int sum = 0;
       //  int sum1 =0;
       //  int sum2 = 0;
       //  int sum3 = 0;
       //  int counter = 0;
       
       // for(int i = 0 ; i<n ;i++) {

       //      if(s[i]==m) {

       //          if(i!=0 && i!=s.length-1) {
       //              sum = s[i] + s[i-1];
       //              sum1 = s[i] + s[i+1];

       //              if(sum == d) {

       //               counter = counter + 1;
       //          }
       //              if(sum1 == d) {
       //               counter = counter +1;
       //          }
       //          }
               
       //      }
       //      else if(s.length==1) {

       //          if(m==1)  {

       //              if(s[0]==d) {

       //                  counter = counter +1;
       //              }
       //          }

       //      }
       //      if(i == 0 || i == s.length-1) {
       //      if(s[i]==m && i==0) {
       //          sum2 = s[i] + s[i+1];   
       //      }
       //      if(s[i]==m && i == s.length-1){

       //          sum3 = s[i] + s[i-1];
       //      }

       //       if(sum2 == d) {

       //               counter = counter + 1;
       //          }
       //      if(sum3 == d) {
       //              counter = counter +1;
       //          }

       //  }
       // }
               
            
       // return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }
}
