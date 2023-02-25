package hibernatdemopack1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class main1 {
	
	public static void main(String args[]) {
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("fibernate.cfg.xml").build();
		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
		
		//connection pool
		
		SessionFactory factory = metadata.getSessionFactoryBuilder().build();
		
		//let's take database connection to do the transaction
		
		//prepare one database in MySQL with name 'hibernatedemo1' before executing below code
		
		Session session = factory.openSession();
		
		hiber1 s1 = new hiber1();
		//s1.setId(11); //it is of no use as we've already created the increament on the mapping file. SO, you don't need to use this line
		//System.out.println(s1.getId()); //it is of no use as we've already created the increament on the mapping file. SO, you don't need to use this line
		s1.setName("XYZ6");
		System.out.println(s1.getName());
		s1.setEmail("xyz6@abc.com");
		System.out.println(s1.getEmail());
		s1.setPassword("XYZ6ABC");
		System.out.println(s1.getPassword());
		
		Transaction tx = session.beginTransaction();
		session.save(s1); 
		//Use the "Save icon" to temporarily save your changes. Note that this doesn't activate any recent changes you made to the workflow.
		tx.commit(); 
		//Use the Commit icon to activate your recent changes.
		//transaction will automatically creates the table in the DB and add the data inserted in the same
		
		session.close();
		factory.close();
		System.out.println("Data inserted successfully");
	}
}
