package q5Day6_org.shapes;

//class for the calculation of area and perimeter of square 
public class square {
	private double x;
	public square(double x){
		this.x = x;
	}
	public double perimeter(){
		return 4*x;
	}
	public double area(){
		return x*x;
	}

}