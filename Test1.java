package sua;
import java.util.*;
class Shape{
	double length,breadth;
	Shape(double l,double b){
		length=l;
		breadth=b;
	}
	Shape(double len){
		length=breadth=len;
	}
	double calculate() {
		return length*breadth;
		
	}
}

public class Test1 extends Shape{
	Test1(double l,double h){
	    super(l*l,h);
	    
	}
	Test1(double l,double b,double h){
		super(l*h,b);
	}
	double calculate() {
		return super.calculate();
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double l=sc.nextDouble();
		double b=sc.nextDouble();
		double h=sc.nextDouble();
		Test1 myshape1=new Test1(l,h);
		Test1 myshape2=new Test1(l,b,h);
		double volume1;
		double volume2;
		volume1 = myshape1.calculate();
		volume2=myshape2.calculate();
		System.out.println(volume1);
		System.out.println(volume2);
	}

	
}

