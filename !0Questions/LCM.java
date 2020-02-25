package com.cts.Questions;

import java.util.*;

public class LCM {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numbers ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int lcm;

		lcm = (n1 > n2) ? n1 : n2;
		while (true) {
			if (lcm % n1 == 0 && lcm % n2 == 0) {
				System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
				break;
			}
			++lcm;
		}
	}
}
