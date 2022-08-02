package Packagee;

public class LAP9 {

    public static void main(String[] args) {
        int arr[] = new int [3];
        arr [0] =10;
        arr [1]=20;
        arr [2]=30;

        int NUMBRT =biggest(arr);
        System.out.println(NUMBRT);
    }

    public static int biggest (int[] Z ){
        int NUMBRT =0;
        for(int i=0;i<Z.length ;i++){

            if (Z[i]>NUMBRT){
                NUMBRT =Z [i];
            }
        }

return   NUMBRT;


    }
}
