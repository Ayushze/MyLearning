//DIFFERENCE BETWEEN INTERFACE AND ABSTRACT
//ABSTRACTION can be achieved in two ways: Interface and abstract

package pack234;

interface A{ //first parent class
	abstract void m1();
	
}
interface A1{ //second parent class
	abstract void m1();
	
}
class B implements A,A1{ // unable to extend more parent classes with the same child class

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("This is a method from abstract class A(extends)");
	}
}

public class Abs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B o = new B();
		o.m1();
	}
}



//abstract class A{ //first parent class
//	abstract void m1();
//	
//}
//abstract class A1{ //second parent class
//	abstract void m1();
//	
//}
//class B extends A,A1{ // unable to extend more parent classes with the same child class
//
//	@Override
//	public void m1() {
//		// TODO Auto-generated method stub
//		System.out.println("This is a method from abstract class A(extends)");
//	}
//}
//
//public class Abs {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		B o = new B();
//		o.m1();
//	}
//}
