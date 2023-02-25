package pacds36;

public class overload {
	
	public static void m1() {
		System.out.println("this is the same void method but without parameters");
	}
	public static void m1(int a, int b) {
		System.out.println(a+b);
	}
//	public static int m1(int x, int y) { //Error: Duplicate method m1(int, int) in type overload
//		return x+y;
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stubf
		m1(3,4);
		m1(); //Java ios smart enough to differentiate the object referem
		
	}
}
