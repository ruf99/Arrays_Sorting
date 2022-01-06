import java.util.Arrays;

public class Insertion_Sort {

	/* References for Part III. Sorting:
	 * 
	 * 1. Data Structures with Mosh - https://www.youtube.com/watch?v=BBpAmxU_NQo
	 * 2. Sorting - Michael Sambol Videos (https://www.youtube.com/c/MichaelSambol/videos)
	 * 3. Introduction to Java Programming & Data Structures: Daniel Liang 11th Ed
	 * 4. Lecture Notes
	 * 
	 * Insertion Sort - Non Recursive
	 */
	
	public static void main(String[] args) {
		int [] thisIsArr = {4,77,98,30,20,50,77,22,49,2};
		int length = thisIsArr.length;
		System.out.println("Our unsorted array is: " + Arrays.toString(thisIsArr));
		System.out.println("Out sorted array (using Insertion Sort) is: " + Arrays.toString(insertionSorting(thisIsArr,length)));

	}
	
	public static int[] insertionSorting(int[] thisIsArr,int length) {	
		int j;
		for (int i = 1; i < length; i++) {
			int chosenElem = thisIsArr[i];
			for (j = i -1; j >= 0 && thisIsArr[j] > chosenElem; j--) {	//allow space to make room for the insertion element
				thisIsArr[j+1] = thisIsArr[j];
			}
			thisIsArr[j+1] = chosenElem;		//insert
		}
		return thisIsArr;
	}
	
}
