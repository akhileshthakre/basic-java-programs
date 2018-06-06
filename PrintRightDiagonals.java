import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PrintRightDiagonals {

   static int[] solve(int[] grades){
        
        int[] a1 = new int[grades.length];
        
        for(int i = 0;i<grades.length ;i++) {

            a1[i] = grades[i];
        }

        for(int j = 0 ; j <grades.length ;j++) {

            if(a1[j]>=38 && a1[j]%5 == 3) {

                a1[j] = a1[j] + 2;


            }else if(a1[j]>=38 && a1[j]%5 == 4){
                a1[j] = a1[j] +1;
            }else if(a1[j]>=38 && a1[j]%5 == 0){
                a1[j] = grades[j];
            }

            if(a1[j]<38){

                a1[j] = grades[j];
            }
        }


        return a1;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
}
}
