package org.deloitte.sms.studentstaffdetailsmanagement.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="STUDENT_MARK_SECONDARY")
public class StudentMarkSecondary {
	@Id
	@Column (length=5)
	 private String student_Id;
	@Column
     private int english_Mark;
	@Column
     private int hindi_Mark;
	@Column
     private int science_Mark;
	@Column
     private int math_Mark;
	@Column
     private int total_Mark;
	@Column
     private double average_Mark;
	@Column (length=3)
     private String grade;
	public String getStudent_Id() {
		return student_Id;
	}
	public void setStudent_Id(String student_Id) {
		this.student_Id = student_Id;
	}
	public int getEnglish_Mark() {
		return english_Mark;
	}
	public void setEnglish_Mark(int english_Mark) {
		this.english_Mark = english_Mark;
	}
	public int getHindi_Mark() {
		return hindi_Mark;
	}
	public void setHindi_Mark(int hindi_Mark) {
		this.hindi_Mark = hindi_Mark;
	}
	public int getScience_Mark() {
		return science_Mark;
	}
	public void setScience_Mark(int science_Mark) {
		this.science_Mark = science_Mark;
	}
	public int getMath_Mark() {
		return math_Mark;
	}
	public void setMath_Mark(int math_Mark) {
		this.math_Mark = math_Mark;
	}
	public int getTotal_Mark() {
		return total_Mark;
	}
	public void setTotal_Mark(int total_Mark) {
		this.total_Mark = total_Mark;
	}
	public double getAverage_Mark() {
		return average_Mark;
	}
	public void setAverage_Mark(int average_Mark) {
		this.average_Mark = average_Mark;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
     
     

}