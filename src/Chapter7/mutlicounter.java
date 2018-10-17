package Chapter7;
import java.util.Scanner;

public class mutlicounter {
    public static void main(String args[]) {
int num= 123980923;
        mode2( num);

    }

    public static void mode2(int num) {
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
        System.out.println(index);


    }
    public static void program2() {
        int number=1297562548;

        int count0=0;
        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        int count5=0;
        int count6=0;
        int count7=0;
        int count8=0;
        int count9=0;

        while(number>0){
            int d= number%10;
            if(d ==1){
                count1++;
            }
            else if(d==2){
                count2++;
            }
            else if(d==3){
                count3++;
            }
            else if(d==4){
                count4++;
            }
            else if(d==5){
                count5++;
            }
            else if(d==6){
                count6++;
            }
            else if(d==7){
                count7++;
            }
            else if(d==8){
                count8++;
            }
            else {
                count9++;
            }
            number= number%10;
        }
        int max1= Math.max(count0, Math.max(count1,Math.max(count3, Math.max(count4,Math.max(count5, Math.max(count6,Math.max(count7, Math.max(count8,count9))))))));
    }

    }

