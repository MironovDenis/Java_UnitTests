package seminar3.third.hw;

public class NumberInInterval {

    /**
     * Разработайте и протестируйте метод numberInInterval, который проверяет, попадает ли
     * переданное число в интервал (25;100)
     */
    public boolean numberInInterval(int n) {
        if (n > 25 & n < 100) {
            return true;
        } else {
            return false;
        }
    }
}
