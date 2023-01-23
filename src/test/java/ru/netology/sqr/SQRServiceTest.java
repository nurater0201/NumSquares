package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void testCalcWhenSomeSquaresFound() {
        SQRService service = new SQRService();

        int actual = service.calc(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testCalcWhenSomeSquaresNoFound() {
        SQRService service = new SQRService();

        int actual = service.calc(0, 50);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test1CalcWhenSomeSquaresNoFound() {
        SQRService service = new SQRService();

        int actual = service.calc(50, 50);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test1CalcWhenSomeSquaresFound() {
        SQRService service = new SQRService();

        int actual = service.calc(50, 20_000);
        int expected = 90;

        Assertions.assertEquals(expected, actual);
    }
}
