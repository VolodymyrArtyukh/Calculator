package CalculatorInterface;

import CalculatorLogic.Formula;

public interface ReaderInterface {
    boolean hasNext();
    Formula readNext();
}
