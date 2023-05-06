package sua;

public class ThrowsDem {
	void numcheck(int n)throws Exception{
		if(n==0) {
			throw new Exception("0 is not valid");
		}
		else {
			System.out.println("Valid");
		}
	}
	public static void main(String[] args) {
		ThrowsDem o=new ThrowsDem();
		try {
			o.numcheck(0);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
