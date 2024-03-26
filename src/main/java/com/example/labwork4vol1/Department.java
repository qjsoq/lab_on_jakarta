package com.example.labwork4vol1;

import java.util.ArrayList;
import java.util.Iterator;

public class Department {
    String departamentName;
    Director departamentDirector;
    ArrayList<Worker> employees;

    public Department(String departamentName, Director departamentDirector, ArrayList<Worker> employees){
        this.departamentName = departamentName;
        this.departamentDirector = departamentDirector;
        this.employees = employees;
    }

    public String getDepartamentName() {
        return departamentName;
    }

    public Director getDepartamentDirector() {
        return departamentDirector;
    }

    public ArrayList<Worker> getEmployees() {
        return employees;
    }
    
    public double departmentBiggestSalary() {
    	double biggestSalary = 0;
    	Iterator<Worker> employeeIterator = employees.iterator();
    	while(employeeIterator.hasNext()) {
    		Worker employee = employeeIterator.next();
    		if (employee.salary > biggestSalary) {
    			biggestSalary = employee.salary;
    		}
    	}
    	return biggestSalary;
    }
    
    public boolean ifEmployeeHasBiggerSalary() {
    	if (departmentBiggestSalary() > departamentDirector.salary) {
    		return true;
    	} else {
    		return false;
    	}
    }
}

