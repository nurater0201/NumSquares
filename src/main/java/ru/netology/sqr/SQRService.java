package ru.netology.sqr;

public class SQRService {

    public int calc(int min, int max) {
        int counter = 0;
        for (int i = 10; i < 100; i++) {
            int square = i * i;
            if (square >= min) {
                if (square <= max) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
