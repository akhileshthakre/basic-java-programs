/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class CountTheChar {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t!=0){
		    StringBuilder s = new StringBuilder();
		    int count = 0;
		 	s.append(scan.next());
		 	
		    for(int i=0;i<s.length();i++){
		        // if(s.charAt(i)!=' '){
		        //     count++;
		        // }
		    	String[] str= s.toString().split(" ");
		    	System.out.print(str[i]);
		    
		    }
		    System.out.print(count+" ");
		    count = 0;
		    t--;
		}
	}
}