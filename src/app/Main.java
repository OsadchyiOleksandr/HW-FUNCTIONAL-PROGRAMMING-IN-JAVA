package app;

import app.classes.RandomNumberGenerator;
import app.classes.StringListProcessor;
import app.functionalinterfaces.MathOperation;
import app.functionalinterfaces.StringManipulator;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    static MathOperation mathOperation;
    static StringManipulator stringManipulator;
    static int a;
    static int b;
    static int sum;
    static String someString;
    static String changedString;

    public static void main(String[] args) {
        a = 1;
        b = 2;
        mathOperation = (int a, int b) -> a + b;
        sum = mathOperation.operate(a, b);
        Display.toShow("Sum = " + sum);

        someString = "try la la";
        stringManipulator = str -> str.toUpperCase();
        changedString = stringManipulator.strToUppercase(someString);
        Display.toShow("Uppercase string = " + changedString);

        Function<String, Integer> uppercaseCounter = StringListProcessor::countUppercase;
        int countedUpperCharacters = uppercaseCounter.apply(changedString);
        Display.toShow("Calc Upper case characters = " + countedUpperCharacters);

        Supplier<Integer> randomizer = () -> RandomNumberGenerator.generateRandomNumber(1, 100);
        int someNum = randomizer.get();
        Display.toShow("This is random int from 1 to 100 : " + someNum);
    }
}
