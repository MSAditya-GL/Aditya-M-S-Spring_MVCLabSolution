package com.greatlearning.debateEventRegistration.service;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.greatlearning.debateEventRegistration.entity.Student;

@Repository
public class StudentServiceImpl implements StudentService {

	private SessionFactory sessionFactory;

	private Session session;

	@Autowired
	public StudentServiceImpl(SessionFactory sessionFactory) {

		this.sessionFactory = sessionFactory;

		try {
			session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			session = sessionFactory.openSession();
		}

	}

	@Transactional
	public List<Student> findAll() {
		Transaction tx = session.beginTransaction();

		List<Student> student = session.createQuery("from Student").list();

		tx.commit();

		return student;

	}

	public Student findById(int id) {
		Student student = new Student();

		Transaction tx = session.beginTransaction();

		student = session.get(Student.class, id);

		tx.commit();

		return student;
	}

	public void save(Student theStudent) {
		Transaction tx = session.beginTransaction();

		session.saveOrUpdate(theStudent);

		tx.commit();

	}

	public void deleteById(int theId) {
		Transaction tx = session.beginTransaction();

		Student student = session.get(Student.class, theId);

		session.delete(student);

		tx.commit();

	}

	@Transactional
	public List<Student> searchBy(int id) {

		Transaction tx = session.beginTransaction();
		String query = "";
		if (id != 0)
			query = "from student where id like '%" + id + "%'";
		else
			System.out.println("Cannot search without input data");

		List<Student> student = session.createQuery(query).list();

		tx.commit();

		return student;
	}

}
