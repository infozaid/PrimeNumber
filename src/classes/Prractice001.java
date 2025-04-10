package classes;

public class Prractice001 {

    public static void main(String[] args){
        int level=4;
        int z=0;

        for(int i=0; i<level; i++){
            for(int s=4; s>i; s--){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print(z+" ");
                z++;
            }
            System.out.println();
        }
    }
}
