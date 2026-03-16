package com.telusko.app;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.telusko.model.Student;

public class GetRecordApp 
{

	public static void main(String[] args) 
	{
			SessionFactory sessionFactory = new Configuration().configure()
					.addAnnotatedClass(Student.class).buildSessionFactory();
			Session session1 =null;
			Session session2=null;
			Session session3=null;
			Session session =null;
			try
			{
			   session1 = sessionFactory.openSession();
			   session2 = sessionFactory.openSession();
			   session3 = sessionFactory.openSession();
			   session = sessionFactory.openSession();
			   Student student = session1.get(Student.class, 1);
			   System.out.println(student);
			   
			   Student students = session1.get(Student.class, 1);
			   System.out.println(students);
			   
			   
			   Student student2 = session2.get(Student.class, 1);
			   System.out.println(student2);
			   Student student3 = session3.get(Student.class, 2);
			   System.out.println(student3);
			   //Student student = session.load(Student.class, 1);
			   Student student4 = session.getReference(Student.class, 1);
        	   if(student4!=null)
    		   {
			   System.out.println("Id is : "+ student4.getId());
			   System.in.read();
		   System.out.println("Name is : "+ student4.getSname());
		   System.out.println("City is : "+ student4.getScity());
		   }
		   else
		   {
			   System.out.println("There is no data/record with given id");
		   }


			      
			}
			catch(HibernateException e)
			{
				e.printStackTrace();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			finally
			{
			    session1.close();
			    sessionFactory.close();
			}
		


	}

}
