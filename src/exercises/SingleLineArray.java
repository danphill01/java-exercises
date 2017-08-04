package exercises;

import java.util.ArrayList;

public class SingleLineArray {
    public static void main(String[] args) {
        Integer[] numlist = {1,1,2,3,5,8};
        printArray(numlist);
    }

    public static void printArray(Integer[] numList) {
        for (int num : numList) {
            System.out.println(num);
        }
    }
}
