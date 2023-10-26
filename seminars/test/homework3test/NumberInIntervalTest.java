package homework3test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import seminar3.third.hw.NumberInInterval;

public class NumberInIntervalTest {
    NumberInInterval number;

    @BeforeEach
    void setUp(){
        number = new NumberInInterval();
    }

    @ParameterizedTest
    @ValueSource(ints = {26,42, 99})
    void numbersInInterval(int n){
        boolean num = number.numberInInterval(n);
        Assertions.assertTrue(num);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 25, 100, 110})
    void numbersOutOfInterval(int n){
        boolean num = number.numberInInterval(n);
        Assertions.assertFalse(num);
    }
}
