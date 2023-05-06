package sua;
class quare{
	void sideOfSquare() {
		int a=10;
		int s=a*a;
		System.out.println("The area of Square is ="+s);
	}
	
}
class ectangle extends quare{
	void area(){
		int l=30;
		int b=20;
		int area=l*b;
		System.out.println("The area of Rectangle:"+area);
	}
}
class Triangle extends ectangle{
	void areaOfTriangle() {
		int h=7;
		int base=10;
		int t=(h*base)/2;
		System.out.println("The area of Triangle:"+t);
	}
}
public class Main extends Triangle{
	public int u=44;
	public static void main(String[] args) {
		Main obj=new Main();
		obj.sideOfSquare();
		obj.area();
		obj.areaOfTriangle();
		obj.area();
	}
}