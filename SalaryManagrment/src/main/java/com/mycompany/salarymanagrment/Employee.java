/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salarymanagrment;

import java.util.Scanner;

/**
 *
 * @author LAPTOPVTC.VN
 */
public class Employee {
   
    private String employeeCode;
    private String employeeName;
    private int yearsOfService;
    private double salaryCoefficient;
    private double basicSalary;
    private double salary;

    public Employee() {

    }

    public double getSalary() {
        return salary;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    public double getSalaryCoefficient() {
        return salaryCoefficient;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public Employee(String code, String name, int years, double coefficient, double basicSalary) {
        this.employeeCode = code;
        this.employeeName = name;
        this.yearsOfService = years;
        this.salaryCoefficient = coefficient;
        this.basicSalary = basicSalary;
    }

    public void InputEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Code:");
        employeeCode = sc.nextLine();
        System.out.print("Enter Employee Name:");
        employeeName = sc.nextLine();
        System.out.print("Enter Employee Years Of Service:");
        yearsOfService = sc.nextInt();
        System.out.print("Enter Employee Salary Coefficient:");
        salaryCoefficient = sc.nextDouble();
        System.out.print("Enter Employee Basic Salary:");
        basicSalary = sc.nextDouble();
    }

    public void SalaryCalculation() {
        salary = salaryCoefficient * basicSalary;
        System.out.println(employeeCode + "-" + employeeName + "-" + salary);

    }

    public void PrintEmployee() {
        System.out.println("Code:" + employeeCode + "-Name:" + employeeName + "-Years:" + yearsOfService + "-Coefficient:" + salaryCoefficient + "-BasicSalary:" + basicSalary);
    }

}