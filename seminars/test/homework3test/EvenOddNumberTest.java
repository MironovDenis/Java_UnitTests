package homework3test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminar3.third.hw.EvenOddNumber;

public class EvenOddNumberTest {

    EvenOddNumber number;
    @BeforeEach
    void setUp(){
        number = new EvenOddNumber();
    }

    @Test
    void oddNumberTest(){
        boolean num = number.evenOddNumber(5);
        Assertions.assertFalse(num);
    }

    @Test
    void evenNumberTest(){
        boolean num = number.evenOddNumber(10);
        Assertions.assertTrue(num);
    }
}
