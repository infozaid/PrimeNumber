


public class checkClassAscendingPatternAndDescendingPattern {

    public static void main(String[] args){

        int levels = 4;
        int z = 0;

        for(int i=0;i<levels;i++){

            for(int s=levels; s>i; s--){
                System.out.print(" ");
            }

            for(int j=0;j<=i;j++){
                System.out.print(z+" ");
                z++;
            }

            System.out.println();

        }

        z--; // adjust to start decrementing from the last number

        // Second half - Descending pattern
        for (int i = levels - 1; i >= 0; i--) {

            // Print spaces
            for (int s = levels; s > i; s--) {
                System.out.print(" ");
            }

            // Print numbers in reverse
            for (int j = 0; j <= i; j++) {
                System.out.print(z + " ");
                z--;
            }

            System.out.println();
        }

    }}
