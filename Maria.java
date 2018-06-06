import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Maria {

    static int[] getRecord(int[] s) {

        int counter1 = 0;
        int counter2 = 0;
        int[] a = new int[s.length];

        for(int j = 0;j<=s.length;j++) {

            a[j] = s[j];
        }

        for(int i = 1; i<=s.length ;i++) {
                if(s[i] > a[i-1] && s[i-1]!=a[i]) {
                     counter1 = counter1 + 1;
                     break;

                 }
            // break;

        }
         System.out.println(counter1);

        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}
