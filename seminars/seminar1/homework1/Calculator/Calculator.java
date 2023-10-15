package seminar1.homework1.Calculator;

public class Calculator {
//    public static int calculation(int firstOperand, int secondOperand, char operator) {
//        int result;
//
//        switch (operator) {
//            case '+':
//                result = firstOperand + secondOperand;
//                break;
//            case '-':
//                result = firstOperand - secondOperand;
//                break;
//            case '*':
//                result = firstOperand * secondOperand;
//                break;
//            case '/':
//                if (secondOperand != 0) {
//                    result = firstOperand / secondOperand;
//                    break;
//                } else {
//                    throw new ArithmeticException("Division by zero is not possible");
//                }
//            default:
//                throw new IllegalStateException("Unexpected value operator: " + operator);
//        }
//        return result;
//    }

    // Нужно написать в калькуляторе метод вычисления суммы покупки со скидкой и проверить его, используя AssertJ
    // Примерная сигнатура и тело метода:
    public static double calculatingDiscount(double purchaseAmount, double discountAmount) {
        // purchaseAmount - сумма покупки (в деньгах)
        // discountAmount - размер скидки (в процентах)
        if (purchaseAmount < 0 || discountAmount < 0 || discountAmount > 100){ // проверяем, что сумма покупки не отрицательная,
            // и что процент скидки не отрицательный и не больше 100%
            throw new ArithmeticException("Указаны неверные значения");
        }
        double discount = purchaseAmount * discountAmount / 100; // размер скидки (в деньгах)
        return purchaseAmount - discount; // сумма покупки со скидкой

    }
}