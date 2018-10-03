package Chapter7;

import java.util.Arrays;

public class ArrayTrafersal {
    public static void main (String args[]){
        int []  array={5,8,7,12};
        abby(array);
    }
    public static void johnny(int [] a){
    int temp= 0;
    for(int i){

    }

    }
    public static void abby(int [] aa){
        int []  temp=new int [aa.length];
        for(int i=aa.length-1; i>=0; i--){
        temp[aa.length-i-1]= aa[i];

    }
    System.out.println(Arrays.toString(temp));
    }

}
