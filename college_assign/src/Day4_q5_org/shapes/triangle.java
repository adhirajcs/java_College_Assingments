package Day4_q5_org.shapes;

//class for the calculation of area and perimeter of triangle 
public class triangle {
	private int x,y,z;
	public triangle(int x,int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public int perimeter(){
		return x+y+z;
	}
	public double area(){
		double s = perimeter()/2;
		double area = Math.sqrt(s*(s-x)*(s-y)*(s-z));
		return area;
	}
}