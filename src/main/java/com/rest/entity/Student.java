package com.rest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	@Id
	private Integer stdId;
	private String name;
	private long rollno;
	private int sub1;
	private int sub2;
	private int sub3;
	private int total;
	private int avg;
	private String grade;
	public Student() {
		super();
	}
	public Integer getStdId() {
		return stdId;
	}
	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getRollno() {
		return rollno;
	}
	public void setRollno(long rollno) {
		this.rollno = rollno;
	}
	public int getSub1() {
		return sub1;
	}
	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}
	public int getSub2() {
		return sub2;
	}
	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}
	public int getSub3() {
		return sub3;
	}
	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Student(Integer stdId, String name, long rollno, int sub1, int sub2, int sub3, int total, int avg,
			String grade) {
		super();
		this.stdId = stdId;
		this.name = name;
		this.rollno = rollno;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.total = total;
		this.avg = avg;
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", name=" + name + ", rollno=" + rollno + ", sub1=" + sub1 + ", sub2=" + sub2
				+ ", sub3=" + sub3 + ", total=" + total + ", avg=" + avg + ", grade=" + grade + "]";
	}
	 
	
	
	

}
