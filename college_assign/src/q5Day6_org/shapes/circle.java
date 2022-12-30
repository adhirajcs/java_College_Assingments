package q5Day6_org.shapes;

// class for the calculation of area and perimeter of circle 
public class circle {
	private double radius;
	public circle(double radius){
		this.radius = radius;
	}
	public double perimeter(){
		return 2*3.14*radius;
	}
	public double area(){
		return 3.14*radius*radius;
	}

}
