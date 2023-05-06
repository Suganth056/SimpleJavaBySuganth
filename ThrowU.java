package sua;

public class ThrowU {
	public static void main(String[] args) {
		try {
			
			int a=-6;
			if(a<0) {
				throw new Exception("Smallest Number");
			}
		}
		catch(Exception e) {
			System.out.println("Exception because "+e);
		}
	}

}
