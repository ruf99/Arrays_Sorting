import java.util.Scanner;

/*
 * REFERENCES:
 * 1. Re-used some code from previous class (CS101) and referenced Palindrome case study (iterative) from the book:
 * Introduction to Java Programming: Daniel Liang 11th ed
 * 
 */

public class Recursion_Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter a string for palindrome testing: ");
		String user_Input = sc.nextLine();
		System.out.print("Is the string: " + user_Input + " a palindrome?" + "\nAnswer: " + isPalindrome(user_Input));
	}
	
	public static boolean isPalindrome(String thisIsString) {
		//easiest way to test palindrome check is moving from the extremes inwards. If they are not equal, it is not a palindrome
		
		int str_Len = thisIsString.length();
		boolean isTrue = true;
		boolean isFalse = false;
		
		if (str_Len == 0 || str_Len == 1) {			//if the string is null or just one letter, it is a palindrome due to individual component.
			return isTrue;							//we simply exit 
		}
		
		if (thisIsString.charAt(0) == thisIsString.charAt(str_Len-1)) {		//Check if first and last letters of string are equal or not
				return isPalindrome(thisIsString.substring(1,str_Len-1));	//make a substring of the original string, and move inwards to check equality
		}																	//at any point if corresponding letters aren't equal, it is NOT a palindrome. 
		
		else {
			return isFalse;													//returns false in case something doesn't match
		}
		
	}

}
