package pack354;

public class Student {

		   private  int rollno;
		    private int java_marks;
		    private int cpp_marks;
		    private int unix_marks;
		    private int percentage;


		    public int getJava_marks() {
		        return java_marks;
		    }
		    public void setJava_marks(int java_marks) {
		        if (java_marks > 100) {
		            System.out.println("Marks value should be less than 100");
		            //throw exception
		        }
		        this.java_marks = java_marks;
		    }
		    public int getCpp_marks() {
		        return cpp_marks;
		    }
		    public void setCpp_marks(int cpp_marks) {
		        if (cpp_marks > 100) {
		            System.out.println("Marks value should be less than 100");
		            //throw exception
		        }
		        this.cpp_marks = cpp_marks;
		    }
		    public int getUnix_marks() {

		        return unix_marks;
		    }
		    public void setUnix_marks(int unix_marks) {
		        if (unix_marks > 100) {
		            System.out.println("Marks value should be less than 100");
		            //throw exception
		        }
		        this.unix_marks = unix_marks;
		    }
		    public int getPercentage() {
		        this.percentage = (this.cpp_marks + this.unix_marks + this.java_marks) /3;
		        return percentage;
		    }

		    public int getRollno() {
		        return rollno;
		    }
		    public void setRollno(int rollno) {
		        this.rollno = rollno;
		    }

}
