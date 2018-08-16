/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.*;

class ArrayRotation {
	public static void main (String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int t = scan.nextInt();
	    while(t!=0){
    	    int n = scan.nextInt();
    	    int[] arr = new int[n];
    	    for(int i =0;i<n;i++) {
    	        arr[i] = scan.nextInt();
    	    }
    	    
    	    int[] arr1 = new int[n];
    	    int k = 0;
    	    for(int j =n-1;j>=0;j--) {
    	        arr1[k] = arr[j];
    	        k++;
    	    }
    	    t--;
    	    for(int a=0;a<arr1.length;a++) {
    	        System.out.print(arr1[a]+" ");
    	    }
	    }
    	    
	    
	}
}