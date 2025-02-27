package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        return getEvenNumbers(start, stop);
    }


    public static String getOddNumbers(int start, int stop) {
        return getOddNumbers(start, stop);
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        return getSquareNumbers(start, stop, step);
    }

    public static String getRange(int start) {
        return getRange(0, 1);
    }

    public static String getRange(int start, int stop) {
        return getRange(start, stop, 1);
    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder sb = new StringBuilder();

        for (int i = start; i < stop; i += step){
            sb.append(i);
        }
        return sb.toString();
    }

    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder sb = new StringBuilder();

        for (int i = start; i < stop; i += step) {
            sb.append((int) Math.pow(i, exponent));
        }
        return sb.toString();
    }
}
