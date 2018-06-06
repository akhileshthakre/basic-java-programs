import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int birthdayCakeCandles(int n, int[] ar) {
        int counter = 0;
       IntSummaryStatistics stat = Arrays.stream(ar).summaryStatistics();
        long max = stat.getMax();
       for(int i = 0;i<n;i++) {
           if(ar[i] == max) {
              counter =  counter + 1;
           }
       }
        return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
