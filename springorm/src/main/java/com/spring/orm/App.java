package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

import net.bytebuddy.asm.Advice.AllArguments;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext con = new ClassPathXmlApplicationContext("com/spring/orm/config.xml");
        StudentDao SD =(StudentDao)con.getBean("studentDao");
        
        //Student student = new Student(1235,"ABC","CITY2");
        
//        System.out.println(SD.insert(student));
//        SD.deleteStudent(1235);
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean go=true;
        while(go) {
        	System.out.println("Press 1 to add new student");
            System.out.println("Press 2 to display all students");
            System.out.println("Press 3 to get detail of single student");
            System.out.println("Press 4 to delete students");
            System.out.println("Press 5 to update students");
            System.out.println("Press 6 to exit");
            
            try {
            	int input = Integer.parseInt(br.readLine());
            	
            	switch(input) {
            	case 1 :
            		//add a new student
            		System.out.println("Enter userID: ");
            		int uId = Integer.parseInt(br.readLine());
            		
            		System.out.println("Enter userName");
            		String uName = br.readLine();
            		
            		System.out.println("Enter user city: ");
            		String uCity = br.readLine();
            		
            		Student s = new Student();
            		s.setId(uId);
            		s.setName(uName);
            		s.setCity(uCity);
            		System.out.println(SD.insert(s)+" student added");
            		System.out.println("*************************************");
            		System.err.println();
            		break;
            	case 2 :
            		System.out.println("******************************************");
            		List<Student> allStudents= SD.getAllStudents();
            		for(Student st : allStudents) {
            			System.out.println(st.getName()+" "+st.getId()+ " "+ st.getCity());
            			System.out.println("**************************************************************");
            		}
            		break;
            	case 3 :
            		//get a single student
            		System.out.println("Enter userID: ");
            		int userId = Integer.parseInt(br.readLine());
            		Student student = SD.getStudent(userId);
            		System.out.println(student.getName()+" "+student.getId()+ " "+ student.getCity());
        			System.out.println("**************************************************************");
            		break;
            	case 4 :
            		//delete student
            		System.out.println("Enter userID: ");
            		int id = Integer.parseInt(br.readLine());
            		SD.deleteStudent(id);
            		System.out.println("Data deleted");
            		break;
            	case 5 :
            		//update student
            		break;
            	case 6 :
            		//exit
            		go=false;
            		break;
            	}
            }
            catch(Exception e) {
            	System.out.println("Invalid input, try with another one");
            	System.out.println(e.getMessage());
            }
        }
        System.out.println("Thank you for using my application. We will see you soon");
        
    }
}
