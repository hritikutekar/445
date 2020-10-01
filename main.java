import java.util.*;
import Maths.MathsOperations;
import Stats.StatsOperations;

class MyClass {
    public static void main(String[] args) {
        int a, b, c;

        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);

        MathsOperations mathsOperations = new MathsOperations();
        StatsOperations statsOperations = new StatsOperations();

        int maxNumber = mathsOperations.maxNumber(a, b, c);
        int minNumber = mathsOperations.minNumber(a, b, c);
        int average = statsOperations.findAverage(a, b, c);
        int median = statsOperations.findMedian(a, b, c);

        System.out.println("Maximum number: " + maxNumber);
        System.out.println("Minimum number: " + minNumber);
        System.out.println("Average: " + average);
        System.out.println("Median: " + median);
    }
}