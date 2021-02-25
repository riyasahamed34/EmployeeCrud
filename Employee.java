package com.ideas2it.employeecrud;

/**
 * Employee Pojo Class
 *
 * @version  2.0 23-02-2021
 * @author  Riyas Ahamed
 */
public class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;
    private int age;
    private long mobileNo;
	
    public int getEmployeeId() {
	return employeeId;
    }

    public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
    }

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public int getAge() {
	return age;
    }

    public void setAge(int age) {
	this.age = age;
    }

    public long getMobileNo() {
	return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
	this.mobileNo = mobileNo;
    }

    public String toString() {
	return "Employee [Id = " + employeeId + ", firstName = " + firstName + 
			", lastName = " + lastName + 
			", age = " + age + ", mobileNo = " + mobileNo + "]";
    }
	

}
