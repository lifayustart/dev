package com.test;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class ThoundsMark {
    public static void main(String[] args) {
        BigDecimal bgBal = new BigDecimal("1234567890.12324");
        BigDecimal bigDecimal = bgBal.setScale(2, BigDecimal.ROUND_HALF_UP);

        BigDecimal bgBal2 = new BigDecimal("1");
        String format = DecimalFormat.getNumberInstance().format(bigDecimal);
        for (int i = 0; i < format.length(); i++) {
            System.out.println(format.charAt(i));
        }
        System.out.println(format);

    }
}
