import java.util.Arrays;

public class TwoDArray {
    public static void main(String args[]){
        int array [][]= new int[5][10];
        for(int i=0; i<5; i++){
            for (int x = 0; x<10; x++) {
                array[i][x] = (i+1)*(x+1);
            }
        }
        System.out.println(Arrays.toString(array[0]));
        System.out.println(Arrays.toString(array[1]));
        System.out.println(Arrays.toString(array[2]));
        System.out.println(Arrays.toString(array[3]));
        System.out.println(Arrays.toString(array[4]));

    }
}
