package sua;

public class Wrapper {
	Wrapper(){
		int a=646;
		Integer a1=new Integer(a);
		Integer bobj=a;
		Integer cobj=Integer.valueOf(17);
		Integer dobj=Integer.valueOf(cobj);
		int d=cobj.intValue();
		int e=Integer.valueOf(635);
		System.out.println(a1);
		System.out.println(bobj);
		System.out.println(cobj);
		System.out.println(dobj);
		System.out.println(d);
		System.out.println(e);
		
	}
	public static void main(String[] args) {
		Wrapper in=new Wrapper();
	}

}
