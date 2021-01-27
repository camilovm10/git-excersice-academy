package Test;

import Data.Calculator;

public class Runner {
    public static void main(String[] args) {


        Calculator calculator = new Calculator();

        System.out.println("2 + 2 = " + calculator.sumMethod(2, 2));
        System.out.println("9 * 4 = " + calculator.multiplyMethod(9, 4));
        System.out.println("12 / 3 = " + calculator.divitionMethod(12, 3));

    }
}
