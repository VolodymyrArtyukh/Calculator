package com.testautomation.apiCalculator;

import com.testautomation.CalculatorInterface.CalculatorInterface;
import io.restassured.response.Response;

import static com.testautomation.apiCalculator.RestController.get;

public class ApiCalculator implements CalculatorInterface {

    @Override
    public double combine(double x, double y) {
        Response response = get(x, y, "+");
        return Double.parseDouble(response.body().asString());
    }

    @Override
    public double deduct(double x, double y) {
        Response response = get(x, y, "-");
        return Double.parseDouble(response.body().asString());
    }

    @Override
    public double multiply(double x, double y) {
        Response response = get(x, y, "*");
        return Double.parseDouble(response.body().asString());
    }

    @Override
    public double divide(double x, double y) {
        Response response = get(x, y, "/");
        return Double.parseDouble(response.body().asString());
    }
}
