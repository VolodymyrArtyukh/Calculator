package com.testautomation.CalculatorLogic;

import com.testautomation.CalculatorInterface.CalculatorInterface;

public class LocalCalculator implements CalculatorInterface {

    @Override
    public double combine(double x, double y) {
        return x + y;
    }

    @Override
    public double deduct(double x, double y) {
        return x - y;
    }

    @Override
    public double multiply(double x, double y) {
        return x * y;
    }

    @Override
    public double divide(double x, double y) {
        return x / y;
    }
}