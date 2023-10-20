package homework2test;

import org.junit.jupiter.api.Assertions;
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

// тестирование выполняю с использованием библиотеки assertj

    /**
     * - Проверить, что экземпляр объекта Car также является экземпляром транспортного средства
     *   (используя оператор instanceof).     *
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
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    /**
     * - Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
     */
    @Test
    void carTestDriveSpeed(){
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    /**
     * - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
     *   машина останавливается (speed = 0).
     */
    @Test
    void carParkSpeed(){
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    // далее для тестирования применяю assert из JUNIT

    /**
     * - Проверить, что производитель машины соответствует представленному образцу     *
     */
    @Test
    void carCompanyIsСorresponds(){
        Assertions.assertEquals(car.getCompany(), "VAZ");
    }

    /**
     * - Проверить, что модель машины соответствует представленному образцу
     */
    @Test
    void carModelIsСorresponds(){
        Assertions.assertEquals(car.getModel(), "NIVA");
    }

    /**
     * - Проверить, что год выпуска машины соответствует представленному образцу
     */
    @Test
    void carMYearReleaseIsСorresponds(){
        Assertions.assertEquals(car.getYearRelease(), 1990);
    }

}
