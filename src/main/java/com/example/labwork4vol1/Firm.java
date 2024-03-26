package com.example.labwork4vol1;

import java.util.ArrayList;
import java.util.Iterator;

public class Firm {
    static String companyName;
    static Director companyDirector;
    static ArrayList<Department> departments;

    // Constructor for firm
    public Firm(String companyName, Director companyDirector, ArrayList<Department> departments) {// винести департмент
        Firm.companyName = companyName;
        Firm.companyDirector = companyDirector;
        Firm.departments = departments;
    }

    // Method to search the bigest salary throw all staff
    //To look through ArrayList was used iterator without type
    public static double biggestSalary(){
        double biggestSalary = 0;
        Iterator departmentsIterator = departments.iterator();
        while (departmentsIterator.hasNext()){
            Department department = (Department) departmentsIterator.next();
            if (department.departmentBiggestSalary() > biggestSalary) {
            	biggestSalary = department.departmentBiggestSalary();
            }
            } 
        return biggestSalary;
    }

    public static ArrayList<String> ifEmployeeHasBiggerSalary(){
        ArrayList<String> result = new ArrayList<>();
        Iterator<Department> i = departments.iterator();
        while(i.hasNext()){
            Department department = i.next();
            if (department.ifEmployeeHasBiggerSalary()) {
            	result.add(department.getDepartamentName());
            }
            
        }
        if (result.isEmpty()){
            result.add("Such departments are not valid for this company");
        }
        return result;
    }

    public static ArrayList<Worker> listOfAllEmployees(){
        ArrayList<Worker> allEmployees = new ArrayList<>();
        for(Department department : departments){
            allEmployees.addAll(department.getEmployees());
        }
        return allEmployees;
    }

}

