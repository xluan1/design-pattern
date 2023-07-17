package com.design.patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {
    private List<String> employees;

    public Employees() {
        employees = new ArrayList<>();
    }

    public Employees(List<String> employees) {
        this.employees = employees;
    }

    public void loadEmployees() {
        //read all employees from database and put into the list
        employees.add("Luan");
        employees.add("Hao");
        employees.add("Vinh");
    }

    public List<String> getEmployees() {
        return employees;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<>();
        for (String s : employees) {
            temp.add(s);
        }
        return new Employees(temp);
    }
}
