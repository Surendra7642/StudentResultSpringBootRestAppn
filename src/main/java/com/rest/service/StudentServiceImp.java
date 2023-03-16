package com.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.entity.Student;
import com.rest.repo.StudentRepo;

@Service
public class StudentServiceImp implements StudentService {
	@Autowired
	private StudentRepo repo;

	public Student insert(Student std) {

		Student s1 = repo.save(access(std));
		return s1;
	}

	public void delete(Integer stdId) {
		repo.deleteById(stdId);

	}

	public Student getOne(Integer stdId) {
		Student s2 = repo.findById(stdId).get();
		return s2;
	}

	public Student update(Student std) {
		Student s3 = null;
		Optional<Student> op = repo.findById(std.getStdId());

		if (op.isPresent()) {
			s3 = repo.save(access(std));
		} else {
			s3 = repo.save(access(std));
		}
		return s3;
	}

	public List<Student> getAll() {
		List<Student> s4 = repo.findAll();
		return s4;
	}

	public Student access(Student std) {
		int total=0;
		int avg=0;
		if((std.getSub1()>=35&&std.getSub1()<100)&&(std.getSub2()>=35&&std.getSub2()<100)&&(std.getSub3()>=35&&std.getSub3()<100))
		{
		total = std.getSub1() + std.getSub2() + std.getSub3();
		std.setTotal(total);
		avg = total / 3;
		std.setAvg(avg);
		if (avg > 75) {
			std.setGrade("A Grade");
		} else if (avg < 75 && avg > 65) {
			std.setGrade("B Grade");
		} else if (avg < 65 && avg > 50) {
			std.setGrade("C Grade");
		} else {
			std.setGrade("Fail");
		}
		}
		else
		{
			total = std.getSub1() + std.getSub2() + std.getSub3();
			std.setTotal(total);
			std.setGrade("fail");
		}
		return std;
	}

}
