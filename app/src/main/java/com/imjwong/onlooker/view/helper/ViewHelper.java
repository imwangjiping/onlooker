package com.imjwong.onlooker.view.helper;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * ViewHelper class
 *
 * @author J.Wong
 * @date 2018/01/19
 */
public final class ViewHelper {

    public final String formatDoublePrice(Object dou) {
        DecimalFormat d =new DecimalFormat("#,##0.00");
        d.setRoundingMode(RoundingMode.HALF_UP);
        return d.format(dou);
    }

}
