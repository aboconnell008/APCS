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
        //adds numbers to the array
        for (int i = 1; i<=a; i++){
            System.out.println("Enter Data:");
            int x =input.nextInt();
            numbers[i-1] = x;
            sum +=x;


        }
        //gets the average
        double avg = (double)sum/a;
        avg = (Math.round(avg * 10.0)) / 10.0;
        System.out.println("The Average tempurature was " + avg);




    }

}