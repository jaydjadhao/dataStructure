package com.ds.recursion;

public class FactorialImpl {

	public static void main(String[] args) {
		System.out.println("factByIterativeImpl : "  + factByIterativeImpl(-3) );
		System.out.println("factByRecursionImpl : "  + factByRecursionImpl(3) );

	} 
	
	public static int factByIterativeImpl(int n) {
		if (n == 0 || n == 1) return 1;
		
		int fact = 1;
		for(int i=1; i<=n; i++) {
			fact *= i;
		}
		return fact;
	}
	
	public static int factByRecursionImpl(int n) {
		if (n <= 1) return 1;
		return n * factByRecursionImpl(n-1);
	}
}
