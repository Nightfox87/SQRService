package ru.netology.sqr;

public class SQRService {

    public int sqrCountCalculate(int lowLimit, int highLimit) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int x = i * i;
            if (x >= 200 && x <= 300) {
                count++;
            }
        }
        return count;
    }

}
