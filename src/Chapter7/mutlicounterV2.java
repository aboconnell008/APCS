package Chapter7;

import java.util.Scanner;

public class mutlicounterV2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("What number do you want to find the mode of:");
        int number = input.nextInt();
        System.out.println("The mode is " + findmode(number));

    }
    public static int findmode(int num) {
        int[] array = new int[10];
        while (num > 0) {
            int test = num % 10;
            array[test]++;
            num /= 10;
        }
        int max = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                index = i;
            }
        }
        return index;

    }
}