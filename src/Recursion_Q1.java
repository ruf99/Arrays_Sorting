import java.util.Arrays;

public class Recursion_Q1 {

	/*
	 * RE-USING CODE FROM MIDTERM Q3.
	 */
	
	public static void main(String[] args) {				//randomizing everything -> array size, to array elements.
		int array_sizeN = (int)(Math.random() * 12 + 1);	//we add 1 so we avoid the possibility of array size = 0
		int [] thisIsArray = new int[array_sizeN];					//Create the array of size random N
		int arrIndex = thisIsArray.length - 1;					//Declare the int for length for passing as parameter
		int start = 0;
		for (int i = 0; i < thisIsArray.length; i++) {				//Using a for loop to randomize all the elements in the Array
			thisIsArray[i] = (int)(Math.random() * 100 + 1);
		}
		
		System.out.println("The maximum element in the array: " + Arrays.toString(thisIsArray) + " is: " + thisIsMax(thisIsArray, start, arrIndex));
		

	}
	
	public static int thisIsMax(int [] thisIsArray, int start, int arrIndex) {	//Our recursive method
	
		if (start == arrIndex) {		//Base Case (called if the entire array is traversed)
			return thisIsArray[start];
		}
		
		int middleArr = (start + arrIndex) / (2);								//Getting the middle index
		int maxElemLeft = thisIsMax(thisIsArray, start, middleArr);				//Searching the elements on the left of middle index till start
		int maxElemRight = thisIsMax(thisIsArray, middleArr + 1, arrIndex);		//Searching the elements on the right of middle index till end
		
		if (maxElemLeft >= maxElemRight) {										//If left side of array has the max element, then return
			return maxElemLeft;
		}
		else {																	//If right side of Array has the max element, then return
			return maxElemRight;
		}
		
	}
}
