package EmployeeApp;

public class Employee {
	private int id;
	private String name;
	private String designationString;
	private long salary;
	public Employee(int id, String name, String designationString, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.designationString = designationString;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignationString() {
		return designationString;
	}
	public void setDesignationString(String designationString) {
		this.designationString = designationString;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	


}
