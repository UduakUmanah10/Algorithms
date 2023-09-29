package sortAlgorithms;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class insertionsortAlgorithms {

    public static void main(String[] args) {
        int[] input ={5,4,3,3,2,2,1};
        insertionSortAlgorithm(input);

        System.out.println(Arrays.toString(input));
    }

    public static   void insertionSortAlgorithm(int[] input){

        //i < input.length-1 is equivalent to the length of the array -2
        for (int i = 0; i < input.length-1; i++) {

            for (int j = i+1; j > 0; j--) {

                if(input[j]<input[j-1]){
                    swap(input, j, j-1);
                }else {
                    break;
                }

            }

        }
    }

    private static void swap(int[] input, int j, int i) {
        int temp = input[j];
        input[j] = input[i];
        input[i]= temp;
    }

    public static void swap(@NotNull Integer[] input, int j, int i) {

    }
}
