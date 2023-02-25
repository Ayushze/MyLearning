package pack11;

class A{
    void show(){
        System.out.println("Super class");
    }
}
class B extends A{
	@Override
    void show(){
        System.out.println("Sub class");
    }
	@Deprecated
	public int sum(int a, int b) {
		return a+b;
	}
}
public class Main{
    public static void main(String[] args) {
    	@SuppressWarnings("deprecation")
        B r = new B();
        r.show();
        System.out.println(r.sum(5, 6));
    }
}