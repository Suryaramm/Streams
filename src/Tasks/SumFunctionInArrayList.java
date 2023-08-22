package Tasks;

import java.util.ArrayList;

public class SumFunctionInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(9);
        numbers.add(1);
        numbers.add(7);

        int sum = numbers.stream()
                        .mapToInt(Integer::intValue) // Convert Integer to int
                        .sum();

        System.out.println("Sum of numbers: " + sum);
    }
}

