package com.rest.service;

import com.rest.entity.Student;
import java.util.List;

public interface StudentService {
	public Student insert(Student std);
	public void delete(Integer stdId);
	public Student getOne(Integer stdId);
	public Student update(Student std);
	public List<Student> getAll();

}
