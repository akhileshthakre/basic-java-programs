/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class ArrayRotationByGivenNumber {
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t!=0) {
		    int n = scan.nextInt();
		    int[] arr = new int[n];
		    for(int i=0;i<n;i++) {
		        arr[i] = scan.nextInt();
		    }
		    int d = scan.nextInt();
		    int j = 0;
		    while(d!=0) {
		        int temp = arr[0];
		        for(j=0;j<n-1;j++) {
		           arr[j] = arr[j+1];
		        } 
		        	arr[j] = temp;
		        d--;
		    }
		    
		    for(int k=0;k<n;k++) {
		        System.out.print(arr[k]+" ");
		    }
		    t--;
		    
		}
	}
}