/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salarymanagrment;

import java.util.*;

/**
 *
 * @author LAPTOPVTC.VN
 */
public class SalaryManagrment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Employee:");
        ArrayList<Employee> list = new ArrayList<>();
        int numberOfEmployee = sc.nextInt();
        for (int i = 0; i < numberOfEmployee; i++) {
            Employee emp = new Employee();
            emp.InputEmployee();
            list.add(emp);
        }
        PrintEmployeeSalary(list);
        
        HighestSalary(list);
        SortSalaryDescreasing(list);
        PrintEmployeeSalary(list);
    }

    public static void PrintEmployeeSalary(ArrayList<Employee> list) {
        System.out.println("Salary Sheet:");
        for (Employee em : list) {
            em.SalaryCalculation();
        }
    }

    public static void HighestSalary(ArrayList<Employee> list) {
        System.out.println("Employees with highest salary:");
        double max = 0;
        for (Employee emp : list) {
            if (emp.getSalary() > max) {
                max = emp.getSalary();
            }
        }
        for (Employee emp : list) {
            if (emp.getSalary() == max) {
                emp.SalaryCalculation();
            }
        }
    }

    public static void SortSalaryDescreasing(ArrayList<Employee> list) {
        System.out.println("From Highest to Lowest salary:");
        Comparator<Employee> com = new Comparator<>() {
            public int compare(Employee emp1, Employee emp2) {
                return (int) (emp2.getSalary() - emp1.getSalary());
            }
        };
        list.sort(com);
    }
}