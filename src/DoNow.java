import java.util.Scanner;

public class DoNow {
    public static void main(String args[]){
        int [] array= {1,2,3,4,5};
        System.out.print("{");
        int temp=0;
        for(int i=4; i>=1; i--){
             temp= array[i];
           System.out.print(temp+",");

        }
        System.out.print(temp-1);
        System.out.print("}");
    }
    public static void swap(){
        Scanner input= new Scanner(System.in);
        int i= input.nextInt();
        int [] array= new int [i];
        System.out.println("import data");
        for(int x=array.length-1; x>=1; x--){
            System.out.println("Enter point:");
            int temp=input.nextInt();
            int temp1= array[x];
            System.out.print(temp1);
        }



}
}
