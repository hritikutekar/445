package Stats;

import Maths.MathsOperations;

public class StatsOperations {
    public int findAverage(int a, int b, int c) {
        int average = (a + b + c) / 3;
        return average;
    }

    public int findMedian(int a, int b, int c) {
        if ((a < b && b < c) || (c < b && b < a)) {
            return b; 
        } else if ((b < a && a < c) || (c < a && a < b)) {
            return a; 
        } else {
            return c; 
        }
    }
}