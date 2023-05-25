package com.exception;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program started.....");
        try {
            System.out.println("Inside try block");
            System.out.println(1 / 0);
            System.out.println("Exiting try block (It wont be displayed because of error)");
        } catch (ArithmeticException e) {
            System.out.println("Inside Arithmetic Exception catch block");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Inside Exception catch block");
            e.printStackTrace();
        } finally {
            System.out.println("Inside finally block. It will be called in every case except System.exit is called inside try or catch block");
        }
        System.out.println("Outside try block");
        System.out.println("Program ended.....");
    }
}