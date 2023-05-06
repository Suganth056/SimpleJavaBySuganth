package sua;
// @@ Returning Object  \----------------------
class Box{
	int length;
	int breadth;
	int height;
	Box(int l,int b,int h){
		length=l;
	    breadth=b;
	    height=h;
	}
	Box doubleBox() {
		Box temp=new Box(2*length,2*breadth,2*height);
		return temp;
	}
}

public class PassingRefDemo extends Box{
	
	public static void main(String[] args) {
		Box b1=new Box(5,3,8);
		Box b2=b1.doubleBox();
		System.out.println("The length="+b2.length+"\nthe breadth="+b2.breadth+"\nThe height="+b2.height);
	}

}
