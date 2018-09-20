package Chapter7;

import java.util.Scanner;

public class WeatherAnalysis3 {
    public static void  main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("How many days would you like?");
        int days = input.nextInt();
        int weather[]= new int[days];
        int sum=0;
         days=days-1;
        for(int i=0;i<=days;i++){
            System.out.println("Enter data");
            int data= input.nextInt();
            weather[i]= data;
            sum= data+sum;
        }

            int average= sum/days;
            System.out.println("The average weather is "+average);
            int larger=1;
            for(int i=0; i<days; i++){
                if(average < weather[i]){
                     larger++;
                }
            }
                System.out.println(larger+" Were above average");
    }
}
