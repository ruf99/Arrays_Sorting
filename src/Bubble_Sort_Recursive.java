import java.util.Arrays;

//Recursive Bubble Sort.

public class Bubble_Sort_Recursive {

	public static void main(String[] args) {
		int [] thisIsArray = {4,77,98,30,20,50,77,22,49,2};
		int arrLen = thisIsArray.length;
		System.out.println("Our unsorted array is: " + Arrays.toString(thisIsArray));
		System.out.println("Out sorted array (using Bubble Sort) is: " + Arrays.toString(thisIsBubble(thisIsArray,arrLen)));
	}
	
	public static int[] thisIsBubble(int[] arr, int arrLen) {
		int thisIsTemp;
		if (arrLen == 1) {		//If our array has one element left to sort, we can call this base case.
			return arr;
		}
		
		else {				
			for (int i = 0; i < arrLen-1; i++) {	//Iterating through all the indexes of the array
				if(arr[i] > arr[i+1]) {				//Typical swap coded
					thisIsTemp = arr[i];			//Utilizing the temporary int for storing arr value
					arr[i] = arr[i+1];
					arr[i+1] = thisIsTemp;
				}
			}
		}return thisIsBubble(arr,arrLen-1);		    //We call on the recursive method, reducing the length of the array. It will run till it reaches the point with only one element left to sort.
	}												//at which point the base case is hit and we return a sorted array.
}
