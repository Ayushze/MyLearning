package pack145646;

enum E { Small,Medium,Large}

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E o = E.Small;
		switch(o) {
		case Small: System.out.println("It is Small");
		break;
		case Medium: System.out.println("it is Medium");
		break;
		case Large: System.out.println("It is Large");
		}
	}
}