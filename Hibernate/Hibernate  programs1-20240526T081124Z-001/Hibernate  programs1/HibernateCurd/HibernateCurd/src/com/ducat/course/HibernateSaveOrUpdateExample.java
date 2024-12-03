
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



public class HibernateSaveOrUpdateExample {

	public static void main(String[] args) {
		
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		//saveOrUpdate example - without transaction
		Session session5 = sessionFactory.openSession();
		Course course = new Course();
		course.setCourseName("java hibernate1234");
		session5.saveOrUpdate(course);
		System.out.println("*****");
		
		//saveOrUpdate example - with transaction
		Session session3 = sessionFactory.openSession();
		Transaction tx3 = session3.beginTransaction();
	     course = new Course();
		course.setCourseName("java hibernate1");
		session3.saveOrUpdate(course);
		course.setCourseName("java hibernate2"); //will be saved into DB
		
		tx3.commit();
		System.out.println("After committing saveOrUpdate transaction");
		System.out.println("*****");
		
		
		Transaction tx4 = session3.beginTransaction();
	
		course.setCourseName("java hibernate3");
		session3.saveOrUpdate(course);
			
		tx4.commit();
		

		
		sessionFactory.close();

	}
}
