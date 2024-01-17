/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.complexnumbercalculation;

import java.util.Scanner;

/**
 *
 * @author LAPTOPVTC.VN
 */
public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber() {

    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
     public void InputComplexNumber() {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter real part:");
         real=sc.nextDouble();
         System.out.println("Enter imaginary part:");
         imaginary=sc.nextDouble();
    }
    public void PrintComplexNumber(){
        System.out.println(real+"+"+imaginary+"i");
    }
   

}