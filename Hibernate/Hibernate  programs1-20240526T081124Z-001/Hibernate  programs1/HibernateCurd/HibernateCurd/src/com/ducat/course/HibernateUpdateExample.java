
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



public class HibernateUpdateExample {

	public static void main(String[] args) {

		// Prep Work
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Course course = (Course) session.get(Course.class, new Long(3));
			course.setCourseName("hibernate4");
		tx.commit();

		// update example
		course.setCourseName("hibernate5");
		Transaction tx7 = session.beginTransaction();
		session.update(course);
		course.setCourseName("hibernate6");
		
		tx7.commit();
		
		sessionFactory.close();

	}

}
