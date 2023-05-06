package sua;

public class Summa {
	public static void main(String[] arge) {
		/******boolean b=false;  ********
		int a=5;
		a+=6;
		System.out.println(a);
		switch(a-1) {
		case 5:
			System.out.println(a);
		case 10:
			System.out.println(a);
			System.out.print("15");
			System.out.println(((a%2==0)?"-even-":"-odd-"));
			break;
		}
		*/
		char nptel[]= {'1','2','3','4','5','6'};
		System.out.println(nptel[0]+nptel[nptel.length-2]);
		System.out.println(""+nptel[nptel.length-2]+nptel[0]);
		System.out.println(""+nptel[0]+nptel[nptel.length-2]);
		char d=102;
		System.out.println(d);
		int mark=5;
		int grace=2;
		int total=mark+(mark>6?++grace:--grace);
		System.out.println(total);
				
		}
		
	}
