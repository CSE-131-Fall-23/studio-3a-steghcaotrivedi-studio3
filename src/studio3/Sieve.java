package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("What number do you want to use.");
		int n = in.nextInt();
		int[] nArray = new int[n];
		for (int i = 0; i < n; i++) {
		
			nArray[i] = i + 2;
		}
		/* for (int k = 2; k < 40; k++) {
			
			 for (int prime : nArray) {
				
				 if (prime / k == 0) {
					 System.out.println(prime + " is NOT PRIME");
		}		
		}
		 } */
		
		for (int k = 2; k < n; k++) {
			for (int x = 0; x < nArray.length; x += k) {
				if (x+k >= n - 1) {
					
				
				nArray[x+k] = 0; }
			}
		}
		
		System.out.println(nArray[2]);
		
	}

}
