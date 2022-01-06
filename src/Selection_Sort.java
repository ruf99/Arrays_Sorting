import java.util.Arrays;

public class Selection_Sort {
	
	public static void main(String[] args) {
		int [] thisIsArr = {4,77,98,30,20,50,77,22,49,2};
		int length = thisIsArr.length;
		System.out.println("Our unsorted array is: " + Arrays.toString(thisIsArr));
		System.out.println("Out sorted array (using Selection Sort) is: " + Arrays.toString(selectionSorting(thisIsArr,length)));
	}
	
	public static int[] selectionSorting(int[] thisIsArr,int length) {	//Same code as the Midterm Q9 (Programming + Conceptual)
		
		int minimum;
		
		for (int i = 0; i < length-1; i++) {
			minimum = i;
			for (int j = i+1; j < length; j++) {
				if (thisIsArr[j] < thisIsArr[minimum]) {
					minimum = j;
				}
			}
			int temporary = thisIsArr[minimum];
			thisIsArr[minimum] = thisIsArr[i];
			thisIsArr[i] = temporary;
		}
		return thisIsArr;
		
	}
}
