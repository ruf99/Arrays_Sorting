import java.util.Arrays;

/* References listed:
 * 1. Data Structures and Algorithms in Java - Second Ed Robert Lafore	(prof bari advised on using this book)
 * 2. Michael Sambol (Merge Sort in 3 minutes) - https://www.youtube.com/watch?v=KF2j-9iSf4Q
 * 3. Briefly went to office hours (my sorted array refused to display), they advised me to convert my array type to long instead of int.
 */

public class Merge_Sort {
	public static void main(String[] args) {
		long[] thisIsArr = {4,77,98,30,20,50,77,22,49,2};
		int this_isArrLen = thisIsArr.length-1;
		System.out.println("Our unsorted array is: " + Arrays.toString(thisIsArr));
		System.out.println("Our sorted array (using Merge Sort) is: " + Arrays.toString(mergeSArr(thisIsArr,0,this_isArrLen)));
	}

	public static long[] mergeSArr(long[] arr, int start_pos, int last_pos) {
			
			if (start_pos == last_pos) {	//no point sorting, since there's only one element in our array. 
				return arr;
			}
			
			else {							//standard division of OG array into two halves (left and right)
				int middle = (start_pos + last_pos) / 2;
				mergeSArr(arr,start_pos,middle);	 //Creating the divided-into-individual units on the Left side of the Original Array
				mergeSArr(arr,middle+1,last_pos); //Creating the divided-into-individual units on the Right side of the Original Array
				 return mergeArrays(arr,start_pos,middle,last_pos);	//invoking the merge sort method (method 2 via diagram)
			}
	}
	
	public static long[] mergeArrays(long[] arr, int start_pos, int theMiddle, int last_pos) { //references listed.
		int a = start_pos;
		int b = theMiddle + 1;
		int c = 0;
		
		long [] thisIsMergedSArr = new long [last_pos - start_pos + 1];	//temporary array that stores our sorted updates.
		
		//starting our 3 while loops for merging
		
		while (a <= theMiddle && b <= last_pos) {			//We set apart and sort the elements from the middle to the end 
			if (arr[a] <= arr[b]) {
				thisIsMergedSArr[c] = arr[a];
				c = c + 1;
				a = a + 1;
			}
			
			else {										//in case the element is not smaller than the ones on the right, we place it in the larger elements array
				thisIsMergedSArr[c] = arr[b];
				c = c + 1;
				b = b + 1;
			}
		}
		
		while (a <= theMiddle) {					//from start to the middle of original array
			thisIsMergedSArr[c] = arr[a];			
			c = c + 1;
			a = a + 1;
		}
		
		while (b <= last_pos) {						
			thisIsMergedSArr[c] = arr[b];
			c = c + 1;
			b = b + 1;
		}
		
		for (a = start_pos; a <= last_pos; a++) {			//placing all elements correctly 
			arr[a] = (int) thisIsMergedSArr[a-start_pos];			
		}
		
		return thisIsMergedSArr;		//returning a fully sorted array. 
	}
}
	

