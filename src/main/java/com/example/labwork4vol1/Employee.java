package com.example.labwork4vol1;

public class Employee extends Worker {
    
	public Employee(String name, String surname, double salary) {
		super(name, surname, salary);
		// TODO Auto-generated constructor stub
	} 

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

	@Override
	public String toString() {
		return  name +" "+ surname ;
	}
    
}
