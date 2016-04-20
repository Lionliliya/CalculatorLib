package com.google.liliyaYalovchenko;


public class Calculator implements DefaultOperations {

    private String expression;

    public String calculate() {
        boolean error = false;
        char sign = ' ';
        String result;
        int number = 0;
        int resultOfCalculation;
        int a = 0;
        int b;
        for (Character ch : expression.toCharArray()) {
            if (ch == '+' || ch == '-') {
                a = number;
                number = 0;
                sign = ch;
            } else if (ch != '+' && ch != '-' && ch!= ' ') {
                number = number*10 + (ch - '0');
            } else if (ch == ' ') {
                error = true;
                System.out.println("Please enter expression in the right format!");
                break;
            }
        }
        b = number;
        resultOfCalculation = sign == '+' ? sumOfNumbers(a, b) : differenceOfNumbers(a, b);
        result = expression + " = " + resultOfCalculation;

        return error == true ? "Wrong format" : result;
    }

    @Override
    public int sumOfNumbers(int a, int b) {
        return a + b;
    }

    @Override
    public long sumOfNumbers(long a, long b) {
        return a + b;
    }

    @Override
    public float sumOfNumbers(float a, float b) {
        return a + b;
    }

    @Override
    public double sumOfNumbers(double a, double b) {
        return a + b;
    }

    @Override
    public int differenceOfNumbers(int a, int b) {
        return a - b;
    }

    @Override
    public long differenceOfNumbers(long a, long b) {
        return a - b;
    }

    @Override
    public float differenceOfNumbers(float a, float b) {
        return a - b;
    }

    @Override
    public double differenceOfNumbers(double a, double b) {
        return a - b;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }
}
