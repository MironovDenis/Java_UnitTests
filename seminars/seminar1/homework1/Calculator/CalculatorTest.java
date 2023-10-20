package seminar1.homework1.Calculator;

import org.assertj.core.api.AbstractThrowableAssert;
import org.assertj.core.api.AssertionsForClassTypes;
import seminar1.homework1.Calculator.Calculator;

public class CalculatorTest {
    public CalculatorTest() {
    }

    public static void main(String[] args) {
        AssertionsForClassTypes.assertThat(Calculator.calculatingDiscount(100.0, 10.0)).isEqualTo(90.0);
        AssertionsForClassTypes.assertThat(Calculator.calculatingDiscount(0.0, 50.0)).isEqualTo(0.0);
        AssertionsForClassTypes.assertThat(Calculator.calculatingDiscount(1000.0, 0.0)).isEqualTo(1000.0);
        AssertionsForClassTypes.assertThat(Calculator.calculatingDiscount(1000.0, 100.0)).isEqualTo(0.0);
        ((AbstractThrowableAssert)AssertionsForClassTypes.assertThatThrownBy(() -> {
            Calculator.calculatingDiscount(-300.0, 10.0);
        }).isInstanceOf(ArithmeticException.class)).hasMessage("Указаны неверные значения");
        ((AbstractThrowableAssert)AssertionsForClassTypes.assertThatThrownBy(() -> {
            Calculator.calculatingDiscount(300.0, -10.0);
        }).isInstanceOf(ArithmeticException.class)).hasMessage("Указаны неверные значения");
        ((AbstractThrowableAssert)AssertionsForClassTypes.assertThatThrownBy(() -> {
            Calculator.calculatingDiscount(300.0, 150.0);
        }).isInstanceOf(ArithmeticException.class)).hasMessage("Указаны неверные значения");
    }
}