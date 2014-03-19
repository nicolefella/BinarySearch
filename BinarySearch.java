//CS201 Assignment 3 Part 1
//Nicole Fella


/**
* This class implements the binary search algorithm we discussed in class.
* As input, take an array of ints and a test int.
* Search for the test integer, return its index if it is in the array or -1 if it is not.
**/
public class BinarySearch
{
	/** 
	 * Searches the sorted array for the test number between loIndex and hiIndex, inclusive. 
	 * Assumes the array is sorted in increasing order (smallest at index 0).
	 * If test is found, returns its index; otherwise, returns -1.
	 **/
	private static int binarySearch( int[] sorted, int test, int loIndex, int hiIndex )
	{
		int mid = (hiIndex+loIndex)/2;
		
		//base case
		if (test == sorted[mid])
			return mid;
		//base ase
		else if (loIndex >= hiIndex)
			return -1;
		//recursive case
		else if(test < sorted[mid])
			return binarySearch(sorted, test, loIndex, mid-1);
		//recursive case -- if test>sorted[mid]
		else
			return binarySearch(sorted, test, mid+1, hiIndex);
	
	}
	
	/** 
	 * Searches the sorted array for the test object between loIndex and hiIndex, inclusive. 
	 * Assumes the array is sorted in increasing order (smallest at index 0).
	 * If test is found, returns its index; otherwise, returns -1.
	 **/
	public static int binarySearch( int[] sorted, int test )
	{
		// start the recursion between first and last indices
		return binarySearch( sorted, test, 0, sorted.length -1 );
	}
	
	/**
	* Creates an array of the first 100 odd numbers
	**/
	public static int[] createOddArray()
	{
		int[] a = new int[100];
		
		for(int i = 0; i<a.length; i++)
			a[i] = 2*i+1;
		
		return a;
	}
	
	/**
	* Creates an array of the following tester values: 26, 78 ,100, 186, 13, 99, 101, 177 
	**/
	public static int[] createTesterArray()
	{
		int[] b = {26, 78 ,100, 186, 13, 99, 101, 177};
		
		return b;
	}
	
	/**
	* Loops through array of tester values and prints out the results of searching.
	**/
	public static void binaryLoopSearch()
	{
		int[] array = createOddArray();

		
		int[] testers = createTesterArray();
			
		for (int i=0; i<testers.length; i++)
		{
			System.out.println("searching for " + testers[i] + ": " + binarySearch(array, testers[i]));
		}
	}
	
	/**
	* Main method.
	**/
	public static void main(String[] args)
	{
		binaryLoopSearch();
	}
}