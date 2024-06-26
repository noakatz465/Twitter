package twitter;

public class Rectangle {
	  private double height;
	    private double width;

	    public Rectangle(double height, double width) {
			super();
			this.height = height;
			this.width = width;
		}


	    public void calculationOfPerimeterOrArea() {
	        if (width - height > 5) {
	            System.out.println(width * height);
	        } else {
	            System.out.println(width * 2 + height * 2);
	        }
	    }

	   

}
