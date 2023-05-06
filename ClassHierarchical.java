package sua;
class Vehicle{
	public void vehicle() {
		System.out.println("I'm a  Vehicle Class\nI Inherited Twowheeler and Fourwheeler");
	}
	
}
class TwoWheeler extends Vehicle{
	public void vehicle() {
		System.out.println("Hi I'm  Twowheeler Class");
	}
	public void dis() {
		
		}
	
} 
class FourWheeler extends Vehicle{
	public void disp() {
		System.out.println("I'm a FourWheeler:");
		}
	
}
class Ducati extends TwoWheeler{
	public void dis() {
	System.out.println("\tI'm Ducati\n\tI'm a Bike ");
	}
}
class Bugatti extends  FourWheeler{
	public void display() {
		System.out.println("\tI'm Bucatti\n\tI'm a Car");
		}
	
}
public class ClassHierarchical {
	public static void main(String[] args) {
		System.out.println("Hierarchical Inheritance:\n\tHierarchical Inheritance is nothing but A parent has more than one child\nFor example class vehicle has two child class namely\n\t*Twowheeler \n\t*FourWheeler");
		Vehicle get=new Vehicle();
		get.vehicle();
		TwoWheeler b=new Ducati();
		b.vehicle();
		b.dis();
		FourWheeler f=new Bugatti();
		f.disp();
		Bugatti h=new Bugatti();
		h.display();
		
		
		
	}

}
