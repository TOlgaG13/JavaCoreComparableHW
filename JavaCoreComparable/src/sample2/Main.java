package sample2;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle[] rectangles = {
	            new Rectangle(4, 5),
	            new Rectangle(3, 6),
	            new Rectangle(2, 2),
	            new Rectangle(null, 4)
	        };

	        
	        Arrays.sort(rectangles, Comparator.nullsLast(Comparator.naturalOrder()));

	        System.out.println("Sort Reactangle:");
	        for (Rectangle rect : rectangles) {
	            System.out.println(rect);
	        }

	        
	        Rectangle maxRectangle = max(rectangles);
	        System.out.println("\nRectangle maxArea:");
	        System.out.println(maxRectangle);
	    }

	   
	    public static <T extends Comparable<T>> T max(T[] array) {
	        if (array == null || array.length == 0) {
	            return null;
	        }

	        T maxElement = null;
	        for (T element : array) {
	            if (element != null && (maxElement == null || element.compareTo(maxElement) > 0)) {
	                maxElement = element;
	            }
	        }
	        return maxElement;
	    }
	}
