package app.classes;

import java.util.Random;

public class RandomNumberGenerator {
    public static int generateRandomNumber(int min, int max){
        if (max <= min){
            throw new IllegalArgumentException("Min >= Max");
        }
        return  (int) (Math.random() * (max - min + 1)) + min;
    }
}
