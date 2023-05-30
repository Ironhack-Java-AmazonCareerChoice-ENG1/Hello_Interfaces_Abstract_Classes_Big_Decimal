package bigdecimals;

import org.w3c.dom.ls.LSOutput;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

        double a = 10;
        double b = 3;

        System.out.println(a / b); // 0.61

        BigDecimal a2 = new BigDecimal("10");
        BigDecimal b2 = new BigDecimal("0.61");
        System.out.println(a2.subtract(b2));
        BigDecimal c2 = new BigDecimal(0.61);

//        a2.add(b2);
//        a2.multiply(b2);
        System.out.println(a2.divide(b2, 2, RoundingMode.HALF_EVEN));
        System.out.println(a2.compareTo(b2));
        System.out.println(b2.equals(c2));


    }
}
