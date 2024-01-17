/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.complexnumbercalculation;

/**
 *
 * @author LAPTOPVTC.VN
 */
public class ComplexNumberCalculation {

    public static void main(String[] args) {
        ComplexNumber num1=new ComplexNumber(3,2);
        num1.PrintComplexNumber();
        ComplexNumber num2=new ComplexNumber(-1,-4);
        num2.PrintComplexNumber();
        
        System.out.println("Sum:" );
        plus(num1,num2).PrintComplexNumber();
        System.out.println("Minus:");
        minus(num1,num2).PrintComplexNumber();
        System.out.println("Multiply:");
        multiply(num1,num2).PrintComplexNumber();
        System.out.println("Divise:");
        divise(num1,num2).PrintComplexNumber();

    }

    public static ComplexNumber plus(ComplexNumber com1, ComplexNumber com2) {
        double real = com1.getReal() + com2.getReal();
        double imaginary = com1.getImaginary() + com2.getImaginary();
        ComplexNumber sum = new ComplexNumber(real, imaginary);
        return sum;
    }

    public static ComplexNumber minus(ComplexNumber com1, ComplexNumber com2) {
        double real = com1.getReal() - com2.getReal();
        double imaginary = com1.getImaginary() - com2.getImaginary();
        ComplexNumber minus = new ComplexNumber(real, imaginary);
        return minus;
    }

    public static ComplexNumber multiply(ComplexNumber com1, ComplexNumber com2) {
        double real = (com1.getReal() * com2.getReal()) - (com1.getImaginary() * com2.getImaginary());
        double imaginary = (com1.getReal() * com2.getImaginary()) + com2.getReal() * com1.getImaginary();
        ComplexNumber sum = new ComplexNumber(real, imaginary);
        return sum;
    }

    public static ComplexNumber divise(ComplexNumber com1, ComplexNumber com2) {
        double real = (com1.getReal() * com2.getReal()) + (com1.getImaginary() * com2.getImaginary()) / ((com2.getReal() * com2.getReal()) + (com2.getImaginary() * com2.getImaginary()));
        double imaginary = (com1.getImaginary() * com2.getReal()) - (com1.getReal() * com2.getImaginary()) / ((com2.getReal() * com2.getReal()) + (com2.getImaginary() * com2.getImaginary()));
        ComplexNumber sum = new ComplexNumber(real, imaginary);
        return sum;
    }
}