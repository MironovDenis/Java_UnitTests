import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import seminar1.first.Calculator.Calculator;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class CalculatorTest {


    @Test
    void evaluatesExpression(){
        Calculator calculator = new Calculator();
        assertThat(calculator.calculation(2, 5, '+')).isEqualTo(7);
    }

    @Test
    void substractionExpression(){
        Calculator calculator = new Calculator();
        assertThat(calculator.calculation(10, 5, '-')).isEqualTo(5);
    }

    @Test
    void multyplicationExpression(){
        Calculator calculator = new Calculator();
        assertThat(calculator.calculation(3, 5, '*')).isEqualTo(15);
    }

    @Test
    void divisionExpression(){
        Calculator calculator = new Calculator();
        assertThat(calculator.calculation(10, 5, '/')).isEqualTo(2);
    }

    @Test
    void expectedIllegalStateExepyionOnInvalidOperatorSymbol(){
        Calculator calculator = new Calculator();
        assertThatThrownBy(() -> calculator.calculation(8, 4, '_'))
                .isInstanceOf(IllegalStateException.class);
    }

    @Test
    void getOperandCompletesCorrectWithNumbers(){
        String testedValue = "9";
        ByteArrayInputStream in = new ByteArrayInputStream(testedValue.getBytes());
        InputStream inputStream = System.in;
        System.setIn(in);

        Calculator.getOperand();

        System.out.println(testedValue);
        System.setIn(inputStream);

    }
    @Disabled
    @Test
    void getOperandCompletesCorrectWithNotNumbers(){
        String testedValue = "k";
        ByteArrayInputStream in = new ByteArrayInputStream(testedValue.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        InputStream inputStream = System.in;
        System.setIn(in);
        System.setOut(new PrintStream(out));

        assertThatThrownBy(() -> Calculator.getOperand()).isInstanceOf(IllegalStateException.class)
                .describedAs("Ошибка в вводимых данных");

        System.setIn(inputStream);
        System.setOut((null));

    }

}