package com.cts.Questions;
import java.util.*;
public class PyramidPattern {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter rows:");
		int rows = input.nextInt();
		for (int i = 1; i <= rows; ++i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
