package Chapter7;


import java.util.Scanner;

public class WeatherAnalysis {
    public static void main(String[] args){
        //This program calculates the average temperature for a number of days
        days();

    }
    public static void days(){

        //Step 1:Ask how many days
        System.out.print("How many days would you like? ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        //Step 2:start the array
        int[] numbers = new int[a];
        // Step 3 : add the numbers
        int sum=0;
        //Forloop for adding numbers to the array
        for (int i = 1; i<=a; i++){
            System.out.println("Enter Data:");
            int x =input.nextInt();
            numbers[i-1] = x;
            sum +=x;


        }
        //gets the average
        double avg = (double)sum/a;
        avg = (Math.round(avg * 10.0)) / 10.0;
        System.out.println("Average temp = " + avg);
        above(avg, numbers, a);
        smaller(avg, numbers, a);



    }
    //what is above average
    public static void above(double avg, int[] array, int n) {
        int larger = 0;
        for (int i = 1; i <= n; i++) {
            if (array[i - 1] > avg) {
                larger++;
            }
        }

            System.out.println(larger + " days were above average.");



    }
    public static void smaller(double avg, int[] array, int n) {
        int smaller = 0;
        for (int i = 1; i <= n; i++) {
            if (array[i - 1] > avg) {
                smaller++;
            }
        }

            System.out.println(smaller + " days were above average.");



    }
}