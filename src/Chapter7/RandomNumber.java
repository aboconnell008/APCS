package Chapter7;

public class RandomNumber {
    public static void main(String args[]){
        int [] teams= new int []{1,2,3,4,5,6,7,8};

        int choose1= 0;
        int choose2= 0;

        for(int x=1; x<=4; x++){
            choose1=(int)(Math.random()*7+ 1);
            teams[choose1]=-1;
            do{
                choose1=(int)(Math.random()*7+ 1);
            }while(teams[choose1]==-1);

            choose2=(int)(Math.random()*7+ 1);
            do{
                choose2=(int)(Math.random()*7+ 1);
            }while(teams[choose2]==-1);

            if(choose1==choose2){
                do{
                    choose1=(int)(Math.random()*7+ 1);
                }while(choose1==-1);

            }

            System.out.println("Team "+ choose1+" will go against "+ choose2);
            teams[choose1]=-1;
            teams[choose2]=-1;
        }

    }
}
