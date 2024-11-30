package sample3;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat[] cats = {
	            new Cat("Sebastian"),
	            new Cat("Fizzy"),
	            new Cat("Tomas")
	        };

	        Arrays.sort(cats);

	        for (Cat cat : cats) {
	            System.out.println(cat);
	        }
	    }
	}
	


