package genericMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArray {
	
	Integer[] intArray = {1,2,3,4};
	String[] stringArray = {"A", "B", "C"};

	    public static <T> T[] reverseArray(T[] array) {
	        T[] reversed = array.clone();
	        int left = 0;
	        int right = array.length - 1;
	        while (left < right) {
	            T temp = reversed[left];
	            reversed[left] = reversed[right];
	            reversed[right] = temp;
	            left++;
	            right--;
	        }
	 
	        return reversed;

	    }
	 
	    public static void main(String[] args) {
	        Integer[] intArray = {1, 2, 3, 4};
	        String[] stringArray = {"A", "B", "C"};
	        System.out.println(Arrays.toString(reverseArray(intArray)));    
	        System.out.println(Arrays.toString(reverseArray(stringArray)));

	    }

	}

	 
