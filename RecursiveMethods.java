package eecs2030.lab7;

import java.util.List;
import java.util.ArrayList;

/**
 * A utility class containing several recursive methods (Lab 7, W2018)
 * 
 * <pre>
 * 
 * For all methods in this API, you are forbidden to use any loops, nor 
 * String or List based methods such as "contains", or methods that use regular expressions
 * </pre>
 * 
 * @author 
 *
 */
public final class RecursiveMethods {

	private RecursiveMethods() {}
	

	

	/**
	 * Given a string, recursively compress all sets of repeating adjacent chars 
	 * within an existing string to a single char. For example, "xyyzzz" yields "xyz".
	 * 
	 * <pre>
	 * 
	 * removeRepeats("fffaaar Ouuut") returns "far Out"
	 * removeRepeats("nooooo  wooorrriiies") returns "no worries"
	 * removeRepeats("Tomorrow") returns "Tomorow"
	 * 
	 * </pre>
	 * 
	 * @param str a string of characters
	 * @return a version of the original string with all repeating adjacent sequences of 
	 * the same character, reduced to a single character
	 */
	public static String removeRepeats(String str) {
	
		
		
	}	

	/**
	 * Return the decimal (integer) representation of a given binary number 
	 * (represented as a string). 
	 * 
	 * 
	 * <p>
	 * E.g. "110" = 1*2^2 + 1*2^1 + 0*2^0 = 4 + 2 + 0 = 6.
	 * </p><p>
	 * This method should compute the integer value recursively (no loops allowed).
	 * In this method, the input binary string may have leading zeros (e.g. "00011" = 3).
	 * </p>
	 * 
	 *  <pre>
	 * 
	 * binaryToInt("0") returns 0
	 * binaryToInt("101") returns 5
	 * binaryToInt("11011") returns 27
	 * binaryToInt("111") returns 7
	 * binaryToInt("0111") returns 7
	 * 
	 * </pre>
	 * 
	 * @param b a non-empty, binary string
	 * @return an integer that represents the decimal value of b
	 */
	public static int binaryToInt( String b ) {
		
	
		
	}
	
	
	
	/**
	 * Return the binary representation of a given number (see Lab 7 URL)
	 * 
	 * <p>
	 * Note that the binary representation of 0 should be 0, and, apart from this case, there
	 * should be no leading 0's in the binary representation.  I.e. 2 = "10" not "0010" 
	 * </p>
	 * 
	 * <pre>
	 * 
	 * intToBinary(7) returns "111"
	 * intToBinary(2) returns "10"
	 * intToBinary(13) returns "1101"
	 * intToBinary(0) returns "0"
	 * 
	 * </pre>
	 * 
	 * @param value an integer to be converted to a binary string
	 * @return a string of binary digits representing the integer "value"
	 */
	public static String intToBinary( int value ) {
		
		
		
		
	}


	
	/**
	 * Returns the index of the element equal to the integer "target" in
	 * the specified sorted list.
	 * 
	 * <p>
	 * Assumptions:<br>
	 * The list t is not modified by this method.
	 * If target exists it exists only once in the list.
	 * </p>
	 * <pre>
	 * 
	 * indexOfTarget([3,2,1], 1 ) gives index = 2;
	 * indexOfTarget([3,2,1], 2 ) gives index = 1;
	 * indexOfTarget([3,2,1], 3 ) gives index = 0;
	 * indexOfTarget([3,2,1], 10 ) gives index = -1;
	 * 
	 * </pre>
	 * 
	 * @param t a list sorted in ascending order
	 * @param target the integer we want to find the index of
	 * @return the index of the element in t that is equal to the target, or -1 if the target is not present in the list
	 * 
	 */
	public static int findTarget(List<Integer> t, int target) {




	}
	
	
	
	/**
	 * Given an array of ints, is it possible to divide the ints into two
	 * groups, so that the sum of one group is a multiple of 12, and the sum of
	 * the other group is odd. Every int must be in one group or the other (never in both).
	 * 
	 * <p>
	 * Hint: Write a recursive helper method (a method that is called from twoGroups and
	 * will actually do the recursion).  This helper method can take whatever arguments you like,
	 * although no loops are allowed!
	 * </p>
	 * <pre>
	 * 
	 * twoGroups([6, 6, 5]) returns true 
	 * twoGroups([5, 5, 6]) returns false
	 * twoGroups([5, 5, 6, 1]) returns true
	 * twoGroups([6, 5, 6, 1]) returns false
	 * 
	 * </pre>
	 * 
	 * @param t an array of integers
	 * @return a boolean indicating true if there exists a non empty subset of integers in nums
	 * whose sum is a multiple of 12, where the sum of the remaining non empty subset of integers is odd
	 */
	public static boolean twoGroups(List<Integer> t) {

		
		
		

	}

	


}



