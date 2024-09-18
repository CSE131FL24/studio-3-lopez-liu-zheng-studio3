package studio3;

import java.util.Scanner;

public class SieveofEratoshenes {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double n = in.nextDouble();
		boolean[] prime=new boolean[(int)n];
		int numPrime=2;
		boolean isPrime=true;
		boolean keepRunning=true;
		for(int i=0;i<n;i++) {
			prime[i]=true;
		}
		for(int i=2;i<Math.sqrt(n);i++) {
			for(int j= i*i;j<n;j+=i) {
				prime[j]=false;
			}
		}
		for(int k=2;k<n;k++) {
			if(prime[k]) {
				System.out.print(k+" ");
			}
		}
		
		

	}

}
