import java.util.Arrays;

/* References listed:
 * 1. Data Structures and Algorithms in Java - Second Ed Robert Lafore	(prof bari advised on using this book)
 * 2. Michael Sambol (Quick Sort in 3 minutes) - https://www.youtube.com/watch?v=Hoixgm4-P4M
 * 3. Heavily relied on the lecture notes for structure of the methods. 
 * 4. Introduction to Java Programming & Data Structures: Daniel Liang 11th Ed
 */

public class Quick_Sort {
	
	public static void main(String[] args) {
		int[] thisIsArr = {4,77,98,30,20,50,77,22,49,2};
		System.out.println("Our unsorted array is: " + Arrays.toString(thisIsArr));
		System.out.println("Our sorted array (using Quick Sort) is: " + Arrays.toString(quickSArr(thisIsArr)));
	}
	
	public static int[] quickSArr(int[] arr) {
		return quickSArr(arr,0,arr.length-1);	//this is our sort method
	}
	
	public static int[] quickSArr(int[] arr, int start_pos, int last_pos) {	
		if (start_pos > last_pos) {
			return arr;
		}
		
		else {
			int pivotLoc = partition(arr,start_pos,last_pos);		//we identify the best possible pivot for iterating through the array
			quickSArr(arr,start_pos,pivotLoc-1);					//recursive call being invoked
			quickSArr(arr,pivotLoc+1,last_pos);						//recursive call being invoked
		}
		return arr;
	}
	
	public static int partition(int[] arr, int start, int last) {	//Partition is to find the pivot
		int thisIsPivot = arr[last];						//choosing the last element as the pivot 					
		int a = start-1;									//index for element smaller than the pivot (next to it) (initially set to -1)
		int b = last;										//index for backward search
		
		
		
		for (int x = start; x <= b; x++) {					//iterate through the entire array 
			if (arr[x] < thisIsPivot) {						//Check if the element is less than the pivot
				a = a + 1;									//loop through the elements one by one in case it is
				int s = arr[a];								//set up a temporary swap
				arr[a] = arr[x];							//if the element is less than the pivot, we swap towards the left of the pivot
				arr[x] = s;
			}
		}
		
		int switchElems = arr[a+1];							//swap the start and last elements to have the perfectly sorted array
		arr[a+1] = arr[last];								//using temporary swap
		arr[last] = switchElems;
		return a+1;											
	}
	
}
