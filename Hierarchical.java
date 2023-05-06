package sua;
class Square{
	void sideOfSquare() {
		int a=10;
		int s=a*a;
		System.out.println("The area of Square is ="+s);
	}
	
}
class Rectangle extends Square{
	void area(){
		int l=30;
		int b=20;
		int area=l*b;
		System.out.println("The area of Rectangle:"+area);
	}
}
public class Hierarchical extends Rectangle{
	public static void main(String[] args) {
		Rectangle obj=new Rectangle();
		obj.sideOfSquare();
		obj.area();
	}
}