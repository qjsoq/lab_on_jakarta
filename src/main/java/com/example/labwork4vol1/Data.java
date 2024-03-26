package com.example.labwork4vol1;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;

public class Data {
    Director dirMain = null;
    Director dirEcom = null;
    Director dirManag = null;
    ArrayList<Worker> managers = new ArrayList<>();
    ArrayList<Worker> economist = new ArrayList<>();
    ArrayList<Worker> main = new ArrayList<>();
    ArrayList<Department> departments = new ArrayList<>();
    // connect to sql
    public void set() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/Saeco"; String username = "root"; String password = "12345Joj@";
        Connection con = DriverManager.getConnection(url, username, password);
        Statement stm = con.createStatement();
        String sql = "SELECT name, surname, salary, position, department FROM employees";
        ResultSet r = stm.executeQuery(sql);
        while(r.next()){
            String name = r.getString("name");
            String surname = r.getString("surname");
            int salary = r.getInt("salary");
            String position = r.getString("position");
            String dp = r.getString("department");
            if (position.equals("worker")){
                Employee worker = new Employee(name,surname,salary);
                switch (dp){
                    case "main": main.add(worker); break;
                    case "economist": economist.add(worker);break;
                    case "manager": managers.add(worker);break;
                }
            }
            else {
                Director director = new Director(name,surname,salary);
                switch (dp){
                    case "main": main.add(director); dirMain = director; break;
                    case "economist": economist.add(director); dirEcom = director;break;
                    case "manager": managers.add(director); dirManag = director;break;
                }
            }
        }
        Department econom = new Department("ecomomist",dirEcom,economist);
        Department manag = new Department("manager",dirManag,managers);
        Department mn = new Department("main",dirMain,main);
        departments.add(econom);departments.add(manag);departments.add(mn);

    }

    public Director getDirMain() {
        return dirMain;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public Data() throws SQLException {
    }
}
