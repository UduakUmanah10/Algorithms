package sortAlgorithms;

import java.util.Arrays;

public class cyclicsortAgorithm {

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1,5,6};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr ));

    }


    static void  cyclicSort(int[] input){
        int i = 0;

        while (i<input.length){

            int correct = input[i]-1; //this is the correct index of element

            if(input[i] != input[correct]){
                swap(input, i, correct);
            }else{
                i++;
            }
        }

    }

    private static void swap(int[] input, int i, int correct) {
        int temp = input[i];
        input[i] = input[correct];
        input[correct] =temp;
    }


    //when the



}
