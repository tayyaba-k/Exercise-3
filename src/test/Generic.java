package test;
import static testing.Sorting.*;

import java.util.Arrays;

public class Generic {
	public static<E> void printArray(E[] elements) {
		for(E element:elements) {
			System.out.println(element);
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		Integer[] array= {5,10,15,20,25,30};
		System.out.println("Array List:");
		printArray(array);
		swap(array,1,2);
		System.out.println("After exchange position:");
		printArray(array);
		
}
}
