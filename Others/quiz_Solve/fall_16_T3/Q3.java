/**
 *Problem:-
 * Binary Search in sorted array
 * 
 * @author Fahim Foysal
 */
package fall_16_T3;

public class Q3 {
	static int binarySearch(int[] array, int num ) {
		int 
		low = 0,
		high = array.length - 1,
		mid = (low+high)/2;
		
		while(array[mid] != num && low <= high) {
			if(array[mid] < num) {
				low = mid + 1;
			}else {
				high = mid - 1;
			}
			mid = (low+high)/2;
		}
		if(low > high) {
			mid = -1;
		}
		return mid;
	}
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,99};
		
		int found = binarySearch(array,3);
		if(found == -1) {
			System.out.println("Not Found");
		}else {
			System.out.println("Found at position: "+ (found+1));
		}
	}

}
