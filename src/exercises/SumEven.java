package exercises;

import java.util.ArrayList;

public class SumEven {
    public static void main(String[] args) {
        int k[] = {1,3,5,4,2,4,3,5,6,10,24};
        ArrayList<Integer> numbers = new ArrayList<Integer>(k.length);
        for (int num : k) {
            numbers.add(num);
        }
        printEvens(numbers);
    }

    public static void printEvens(ArrayList<Integer> numbers) {
        for (int num : numbers) {
            if (num%2 == 0) {
                System.out.println(num);
            }
        }

    }
}
