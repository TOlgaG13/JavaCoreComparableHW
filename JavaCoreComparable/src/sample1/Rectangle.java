package sample1;

public class Rectangle implements Comparable<Rectangle> {
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
	        if (other == null || other.getArea() == null) {
	            return 1; 
	        }
	        if (this.getArea() == null) {
	            return -1; 
	        }
	        return Integer.compare(this.getArea(), other.getArea());
	    }
	  @Override
	    public String toString() {
	        return "Rectangle{" + "length=" + length + ", height=" + height + ", area=" + getArea() + '}';
	    }
	}
	 
	
	 

