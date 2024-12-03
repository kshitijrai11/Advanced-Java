
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


public class HibernateMergeExample {

	public static void main(String[] args) {

		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Course course = (Course) session.get(Course.class, new Long(3));
		System.out.println(course.getCourseName());
		tx.commit();

		 //merge example - data already present in tables
		 course.setCourseName("hibernate8");
		 Transaction tx8 = session.beginTransaction();
		Course course1= (Course) session.merge(course);
		 System.out.println(course1== course); // returns false
		 
		course1.setCourseName("hibernate10");
		 course.setCourseName("hibernate11");
		 tx8.commit();
		 
		sessionFactory.close();

	}

}
