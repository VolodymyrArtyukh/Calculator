package com.testautomation.CalculatorInterface;

import com.testautomation.CalculatorLogic.Formula;

public interface ReaderInterface {
    boolean hasNext();
    Formula readNext();
}
