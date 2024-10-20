import java.math.BigDecimal;
import java.math.RoundingMode;

class Solution {
    public double[] convertTemperature(double celsius) {
        BigDecimal Kelvin = new BigDecimal(celsius + 273.15).setScale(3, RoundingMode.HALF_UP);
        BigDecimal Fahrenheit = new BigDecimal(celsius * 1.80 + 32.00).setScale(3, RoundingMode.HALF_UP);
        return new double[]{Kelvin.doubleValue(), Fahrenheit.doubleValue()};
    }
}
