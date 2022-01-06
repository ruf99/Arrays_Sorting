import java.util.Scanner;
import java.util.Arrays;

public class Arrays_Q1 {
	public static void main(String[] args) {
		//store string value in arrays, compare array values
		
		Scanner sc = new Scanner(System.in);							//open scanner for user input
		System.out.println("Please enter the first string here: ");		//get first string
		String str_1 = sc.nextLine();
		System.out.println("Please enter the second string here: ");	//get second string
		String str_2 = sc.nextLine();
		System.out.println("Are the two strings reversed? \nAnswer: " + areReverseStrings(str_1, str_2));	//pass strings as parameters into check equality method
		 
		 
	}
	public static String[] strToArr(String input) {	//this method will basically convert our string values into lower case string arrays
		String[] orig = input.split("",input.length());
		String[] arr = new String[input.length()];
		for (int x = 0; x < arr.length; x++) {
			arr[x] = orig[x].toLowerCase();
		}
		return arr;
	}
	
	public static int areReverseStrings(String input1, String input2) {
		String str_1 = input1.replaceAll("\\s", "");
		String str_2 = input2.replaceAll("\\s", "");
		String[] a = strToArr(str_1);
		String[] b = strToArr(str_2);
		
		System.out.println("The first string input in array form: " + Arrays.toString(a));
		
		System.out.println("The second string input in array form: " + Arrays.toString(b));
	
		if (a.length != b.length) {
			return 0;
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = b.length-1; j >= 0;) {
				if (a[i].equals(b[j])) {
					return 1;
				}
				
				else {
					return 0;
				}
			}
		}
		return 0;
		
		
	}
}

