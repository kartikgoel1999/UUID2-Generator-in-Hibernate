package edu.aptech.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import edu.aptech.domain.Student;

public class ClientApp
{
	public static void main(String[] args)
	{
		Transaction tx=null;
		SessionFactory factory=null;
		Session session=null;
		Student s=new Student();
		Configuration cfg=new Configuration();
		cfg.configure("edu/aptech/cfgs/hibernate.cfg.xml");
		factory=cfg.buildSessionFactory();
		session=factory.openSession();
		s.setF_name("Raja");
		s.setL_name("Kumar");
		s.setEmail("rajakumar@gmail.com");
		try
		{
			tx=session.beginTransaction();
			String id=(String)session.save(s);
			tx.commit();
			System.out.println("Student with id::"+id);
		}
		catch(Exception e)
		{
			tx.rollback();
		    System.out.println("Failed to Save Object!!");
		    e.printStackTrace();
		}
	}

}
