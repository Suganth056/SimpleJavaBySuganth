package sua;

public class SwapTwoWithoutThirdVar {
	public static void main(String[] args) {
		int a=5,b=8;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("A="+a+"\nB="+b);
		int count = 1;
		while (count <= 15)
		{
		System.out.println(count % 2 == 1 ? "***" :
		"+++++");
		++count;
			}

	
	}

}
