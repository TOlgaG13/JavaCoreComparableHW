package sample1;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Rectangle[] rectangles = {
		            new Rectangle(4, 5),
		            new Rectangle(3, 6),
		            new Rectangle(2, 2),
		            new Rectangle(null,4)
		        };

		 Arrays.sort(rectangles, Comparator.nullsLast(Comparator.naturalOrder()));

	        for (Rectangle rect : rectangles) {
	            System.out.println(rect);
	        }
		    }
		
	

}
