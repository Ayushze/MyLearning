package pack1;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.setName("XYZ");
		System.out.println(s.name);
		System.out.println(s.getAge());
		s.setRoll_no(2);
		System.out.println(s.getRoll_no());
		System.out.println(s.course);
	}
}
