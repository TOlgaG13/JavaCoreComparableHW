package sample2;

public class Rectangle implements Comparable<Rectangle>{
	 private Integer length;
	    private Integer height;

	    public Rectangle(Integer length, Integer height) {
	        this.length = length;
	        this.height = height;
	    }

	    public Integer getLength() {
	        return length;
	    }

	    public Integer getHeight() {
	        return height;
	    }

	    public Integer getArea() {
	        if (length == null || height == null) {
	            return null; 
	        }
	        return length * height;
	    }

	    @Override
	    public int compareTo(Rectangle other) {
	      
	        if (this.length == null || this.height == null) {
	            return -1;
	        }

	        
	        if (other == null || other.length == null || other.height == null) {
	            return 1;
	        }

	      
	        return this.getArea().compareTo(other.getArea());
	    }

	    @Override
	    public String toString() {
	        return "Rectangle{length=" + length + ", height=" + height + ", area=" + getArea() + "}";
	    }
	}


