package homework2test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminar2.second.hw.Motorcycle;
import seminar2.second.hw.Vehicle;

import static org.assertj.core.api.Assertions.assertThat;

public class MotorcycleTest {

    Motorcycle motorcycle;

    @BeforeEach
    void setUp(){
        motorcycle = new Motorcycle("URAL", "VOLK", 2011);
    }

    // тестировае выполняю с использованием JUNIT

    /**
     * - Проверить, что экземпляр объекта Motorcycle также является экземпляром транспортного средства
     *   (используя оператор instanceof).
     */
    @Test
    void motorcycleIsVehicle(){
        Assertions.assertTrue(motorcycle instanceof Vehicle);
    }

    /**
     * - Проверить, что объект Motorcycle создается с 2-мя колесами.
     */
    @Test
    void motorcycleHaveTwoWeels(){
        Assertions.assertEquals(motorcycle.getNumWheels(), 2);
    }

    /**
     * - Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
     */
    @Test
    void motorcycleTestDriveSpeed(){
        motorcycle.testDrive();
        Assertions.assertEquals(motorcycle.getSpeed(), 75);
    }

    /**
     * - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
     *   мотоцикл останавливается (speed = 0).
     */
    @Test
    void motorcycleParkSpeed(){
        motorcycle.testDrive();
        motorcycle.park();
        Assertions.assertEquals(motorcycle.getSpeed(), 0);
    }

    // далее для тестирования применяю библиотеку assertj

    /**
     * - Проверить, что производитель мотоцикла соответствует представленному образцу     *
     */
    @Test
    void motorcycleCompanyIsСorresponds(){
        assertThat(motorcycle.getCompany()).isEqualTo("URAL");
    }

    /**
     * - Проверить, что модель мотоцикла соответствует представленному образцу
     */
    @Test
    void motorcycleModelIsСorrespondsWithIgnoringCase(){
        assertThat(motorcycle.getModel()).isEqualToIgnoringCase("Volk");
    }

    /**
     * - Проверить, что год выпуска мотоцикла соответствует представленному образцу
     */
    @Test
    void motorcycleMYearReleaseIsСorresponds(){
        assertThat(motorcycle.getYearRelease()).isEqualTo(2011);
    }
}
