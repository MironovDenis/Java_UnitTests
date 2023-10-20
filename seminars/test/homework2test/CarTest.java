package homework2test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminar2.second.hw.Car;
import seminar2.second.hw.Vehicle;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

    Car car;

    @BeforeEach
    void setUp(){
        car = new Car("VAZ", "NIVA", 1990);
    }

    /**
     * - Проверить, что экземпляр объекта Car также является экземпляром транспортного средства
     * (используя оператор instanceof).
     */
    @Test
    void carIsVehicle(){
        assertThat(car instanceof Vehicle);
    }

    /**
     * - Проверить, что объект Car создается с 4-мя колесами.
     */
    @Test
    void carHave4Weels(){

    }

}
