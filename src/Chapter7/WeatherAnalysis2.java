package Chapter7;

import java.util.Scanner;

public class WeatherAnalysis2 {
    public static void  main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("How many days would you like?");
        int days = input.nextInt();
        int weather[]= new int[days];
        int sum=0;
            for(int i=1;i<=days;i++){
                System.out.println("Enter data");
               int data= input.nextInt();
                weather[i]= data;
                 sum= data+sum;
            }
            int average= sum/days;
            System.out.println("The average weather is "+average);



    }
}
