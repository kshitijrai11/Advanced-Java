
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



public class Hibernategetandload {

	public static void main(String[] args) {

		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Course course = (Course) session.get(Course.class, new Long(3));
		System.out.println(course);
			//System.out.println(course.getCourseName());
		
Course course1 = (Course) session.load(Course.class, new Long(3));
		
		System.out.println(course1.getCourseName());
		
		
		
		
		tx.commit();
		
		sessionFactory.close();

	}

}
