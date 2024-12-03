
package com.ducat.course;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import java.util.List;
import java.util.Iterator;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ducat.util.HibernateUtil;


public class HibernatePersistExample {

	public static void main(String[] args) {
		
	
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();	
		
		//persist example - with transaction
		Session session2 = sessionFactory.openSession();
		Transaction tx2 = session2.beginTransaction();
		Course course = new Course();
		course.setCourseName("java hibernate");
		session2.persist(course);
		System.out.println("Persist called");
		course.setCourseName("java spring"); // will be updated in database too
		System.out.println("course Name updated");
		System.out.println("  id="+course.getCourseId()+", course name="+course.getCourseName());
		tx2.commit();
		System.out.println("*****");
		
		// Close resources
		sessionFactory.close();

	}

}
