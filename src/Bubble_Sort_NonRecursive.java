import java.util.Arrays;

/* References for Part III. Sorting:
 * 
 * 1. Data Structures with Mosh - https://www.youtube.com/watch?v=BBpAmxU_NQo
 * 2. Sorting - Michael Sambol Videos (https://www.youtube.com/c/MichaelSambol/videos)
 * 3. Introduction to Java Programming & Data Structures: Daniel Liang 11th Ed
 * 
 * Non-Recursive Bubble Sort.
 */

public class Bubble_Sort_NonRecursive {
	public static void main(String[] args) {
		int [] thisIsArray = {4,77,98,30,20,50,77,22,49,2};
		System.out.println("Our unsorted array is: " + Arrays.toString(thisIsArray));
		System.out.println("Out sorted array (using Bubble Sort) is: " + Arrays.toString(thisIsBubble(thisIsArray)));
	}

	public static int[] thisIsBubble(int[] arr) {	//Pass the array to the method
		int arrayIndex = arr.length-1;				//Get the length, and max index number
		int thisIsTemp;								//set up a temporary int for storing array index
		for (int i = 0; i < arrayIndex; i++) {			//First for loop to check "left" value
			for (int j = 0; j < arrayIndex - i; j++) {	//Second for loop to check next value
				if (arr[j] > arr[j+1]) {				//Upon comparison, if left value is greater, we shift it/"bubble" it towards rightmost side
					thisIsTemp = arr[j];				//Typical swap method coded
					arr[j] = arr[j+1];
					arr[j+1] = thisIsTemp;
				}
			}
		}
		return arr;										//return a sorted array.
	}
}
