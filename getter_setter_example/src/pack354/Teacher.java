package pack354;

public class Teacher {

	public static void main(String[] args) {
		Student o = new Student();
		System.out.print("Your Roll number: ");
		o.setRollno(2);
		System.out.println(o.getRollno());
		System.out.println();
		System.out.print("Your JAVA marks: ");
		o.setJava_marks(89);
		System.out.println(o.getJava_marks());
		System.out.print("Your CPP marks: ");
		o.setCpp_marks(77);
		System.out.println(o.getCpp_marks());
		System.out.print("your UNIX marks: ");
		o.setUnix_marks(92);
		System.out.println(o.getUnix_marks());
		System.out.println();
		System.out.print("Your Percentage: ");
		System.out.println(o.getPercentage());
	}
}