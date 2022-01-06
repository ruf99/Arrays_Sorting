import java.util.Scanner;
public class Recursion_Q2 {

	/*
	 * References:
	 * 1. Understanding Integer to Binary basic conversion: https://walker.cs.grinnell.edu/courses/161.fa12/data-representation/reading-binary.shtml#b2d-a
	 * 2. Robert Lafore Book 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number [INT]: ");
		int user_Input = sc.nextInt();
		
		System.out.print("The number of zeroes in the binary representation of the number: " + user_Input + " are = " + thisIsZ(user_Input));
		
	}
	
	public static int thisIsZ(int number) {
		int zeroes = 0; 			//Our counter.
		if (number == 0) {			//no need to do anything much if input is 0
			zeroes++;
			return zeroes;
		}
		
		else if (number == 1) {	//same for 1, simple return value
			return zeroes;
		}
		
		else if (number % 2 == 0) {		//even
			return thisIsZ(number/2) + 1;
		}
		
		else {							//odd
			return thisIsZ(number/2);
		}
	}
}

