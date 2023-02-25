package pack32536;

class shape{
	public void name() {
		
	};
	public void area() {
		
	};
}
class circular extends shape{
	@Override
	public void name(){
		System.out.println("Circle");
	}

	@Override
	public void area() {
		System.out.println("(pie)*r^2");
		
	}
}
class rectangular extends shape{
	@Override
	public void name(){
		System.out.println("Rac");
	}

	@Override
	public void area() {
		System.out.println("l*b");
		
	}
}
class triangular extends shape{
	@Override
	public void name(){
		System.out.println("Right Angle Triangle");
	}

	@Override
	public void area() {
		System.out.println("(0.5)*b*h");
	}
}
public class inherate{
	public static void main(String[] args) {
		circular c = new circular();
		rectangular r = new rectangular();
		triangular t = new triangular();
		System.out.print("Shape name: ");
		c.name(); 
		System.out.print("Area: ");
		c.area(); 
		System.out.println(" ");
		System.out.print("Shape name: ");
		r.name(); 
		System.out.print("Area: ");
		r.area(); 
		System.out.println(" ");
		System.out.print("Shape name: ");
		t.name(); 
		System.out.print("Area: ");
		t.area(); 
	}
}