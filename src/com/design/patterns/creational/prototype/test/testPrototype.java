package com.design.patterns.creational.prototype.test;

import com.design.patterns.creational.prototype.Employees;

import java.util.List;

public class testPrototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employees employees = new Employees();
        employees.loadEmployees();

        //Use the clone method to get the Employee object
        Employees employees1 = (Employees) employees.clone();
        Employees employees2 = (Employees) employees.clone();

        List<String> list = employees1.getEmployees();
        list.add("Vuong");
        List<String> list1 = employees2.getEmployees();
        list1.remove("Luan");

        System.out.println("emps List: "+employees.getEmployees());
        System.out.println("empsNew List: "+list);
        System.out.println("empsNew1 List: "+list1);
    }
}
