package seminar1.homework1.Calculator;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class CalculatorTest {
    public static void main(String[] args) {


//         //Проверка базового функционала с целыми числами, с использованием утверждений AssertJ:
//        assertThat(Calculator.calculation(2, 6, '+')).isEqualTo(8);
//        assertThat(Calculator.calculation(2, 2, '-')).isEqualTo(0);
//        assertThat(Calculator.calculation(2, 7, '*')).isEqualTo(14);
//        assertThat(Calculator.calculation(100, 50, '/')).isEqualTo(2);
//
//        // Проверка ожидаемого исключения, с использованием утверждений AssertJ:
//        assertThatThrownBy(() -> Calculator.calculation(8, 4, '_')
//        ).isInstanceOf(IllegalStateException.class);

        /**
         * 1. Проверка расчета скидки
         */
        assertThat(Calculator.calculatingDiscount(100, 10)).isEqualTo(90);

        /**
         * 2. Проверка расчета скидки, если сумма покупки равна 0
         */
        assertThat(Calculator.calculatingDiscount(0, 50)).isEqualTo(0);

        /**
         * 3. Проверка суммы покупки, если скидка равна 0%
         */
        assertThat(Calculator.calculatingDiscount(1000, 0)).isEqualTo(1000);

        /**
         * 4. Проверка суммы покупки, если скидка равна 100%
         */
        assertThat(Calculator.calculatingDiscount(1000, 100)).isEqualTo(0);

        /**
         * 5. Проверка выброса исключения, если сумма покупки отрицательная
         */
        assertThatThrownBy(() -> Calculator.calculatingDiscount(-300, 10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Указаны неверные значения");

        /**
         * 6. Проверка выброса исключения, если процент скидки отрицательный
         */
        assertThatThrownBy(() -> Calculator.calculatingDiscount(300, -10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Указаны неверные значения");

        /**
         * 7. Проверка выброса исключения, если процент скидки больше 100%
         */
        assertThatThrownBy(() -> Calculator.calculatingDiscount(300, 150))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Указаны неверные значения");



    }
}