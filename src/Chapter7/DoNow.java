package Chapter7;
import java.util.Random;
import java.util.Scanner;

public class DoNow {
    public static void main(String[]args){
        Random rand = new Random();
        Scanner input= new Scanner(System.in);
        System.out.println("what is the size of the container?");
        int size = input.nextInt();
        int array[]= new int[size];
        for(int x=0; x<=size; x++){
            int  n =(int) Math.random();
            array[x]= n ;
        }
    }
}

