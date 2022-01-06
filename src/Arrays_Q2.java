import java.util.Arrays;
import java.util.Scanner;
public class Arrays_Q2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the set of strings (minimum 3): ");
		String strSet = sc.nextLine();
		
		string_2Array(strSet);
		
	}
	private static void string_2Array(String user_input) {
		String[] str_arr = user_input.split(" ", user_input.length());
		System.out.println("The inputted String in array format: " + Arrays.toString(str_arr));						//In array format
		letsDownsize(str_arr);
	}
	
	public static void letsDownsize(String[] arr) {
		String temp = " ";
		String shortest = "";
		for (int x = 0; x <arr.length; x += 3) {	//this is iterating like per 3 elements
			temp = arr[x] + " ";						//becomes our shortest string for comparison reasons
			for (int j = x; j < x + 3; j++) {		//this checks internally in the three strings which is shortest
				if (temp.length() > arr[j].length()) {
					temp = arr[j] + " ";				//change temp only if we find another shorter string than arr[j] 
				}
			}
			shortest += temp;		//add to our string shortest so we can display
		}
		System.out.println("The final edited version of our original string set: " + shortest);
	}
}
