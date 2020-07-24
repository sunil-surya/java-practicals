package utility;

import java.util.List;

public class Student {
	
	
	String name;
	double gpa;
	int gradelvel;
	String gender;
	List<String> activities;
	
	public Student(String name, double gpa, int gradelvel, String gender, List<String> activities) {
		super();
		this.name = name;
		this.gpa = gpa;
		this.gradelvel = gradelvel;
		this.gender = gender;
		this.activities = activities;
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + ", gradelvel=" + gradelvel + ", gender=" + gender
				+ ", activities=" + activities + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public int getGradelvel() {
		return gradelvel;
	}
	public void setGradelvel(int gradelvel) {
		this.gradelvel = gradelvel;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<String> getActivities() {
		return activities;
	}
	public void setActivities(List<String> activities) {
		this.activities = activities;
	}
	

}
