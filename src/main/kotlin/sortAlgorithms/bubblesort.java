package sortAlgorithms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class bubblesort  {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));


    }


    static void bubbleSort(int[] input){

        for (int i =0; i < input.length; i++){
            boolean swapped = false;

            for(int j=1; j < input.length - i; j++){

                if(input[j] < input[j-1]){

                    extracted(input, j);
                    swapped =true;
                    //swap(input[j], input[j-1]);

                }
            }

            if(!swapped){
                break;

            }


        }


    }

    private static void extracted(int[] input, int j) {
        int temp = input[j];
        input[j]= input[j -1];
        input[j -1] = temp;
    }

}
