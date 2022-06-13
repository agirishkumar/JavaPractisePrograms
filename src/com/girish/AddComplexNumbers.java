package com.girish;

public class AddComplexNumbers {
    int real;
    int imaginary;

    public AddComplexNumbers(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public static AddComplexNumbers add(AddComplexNumbers c1, AddComplexNumbers c2) {
        AddComplexNumbers temp = new AddComplexNumbers(0,0);
        temp.real = c1.real + c2.real;
        temp.imaginary = c1.imaginary + c2.imaginary;
        return temp;
    }

    public static void main(String[] args) {
        AddComplexNumbers c1 = new AddComplexNumbers(5,6);
        AddComplexNumbers c2 = new AddComplexNumbers(17,85);
        AddComplexNumbers result = add(c1,c2);
        System.out.println("Sum is: "+ result.real+" + i"+ result.imaginary );
    }




}
