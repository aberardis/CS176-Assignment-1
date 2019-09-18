package Assignment1AnthonyBerardis;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the element");

		int array[] = new int[5];
		int total = 0;
		int a = 0;

		System.out.println();

		for (int i = 0; i <= 4; i++) {

			System.out.print(i);

			array[a] = input.nextInt();
			a++;

		}
		for (int num : array)
			total += num;
		System.out.print(total);
	}
}
