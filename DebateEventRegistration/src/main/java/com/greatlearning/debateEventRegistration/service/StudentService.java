package com.greatlearning.debateEventRegistration.service;

import java.util.List;

import com.greatlearning.debateEventRegistration.entity.Student;

public interface StudentService {

	public List<Student> findAll();

	public Student findById(int id);

	public void save(Student theStudent);

	public void deleteById(int theId);

	public List<Student> searchBy(int id);

}
