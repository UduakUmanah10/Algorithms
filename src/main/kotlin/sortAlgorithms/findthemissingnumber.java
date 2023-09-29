package sortAlgorithms;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findthemissingnumber {

    public static void main(String[] args) {
        int[] arr = {1,1};
         List<Integer> answer = cyclicSort(arr);
        System.out.println(answer);

    }


    static List<Integer>  cyclicSort(int[] input){
         int i = 0;
        List<Integer> ans = new ArrayList<>();

        while (i<input.length){

            int correct = input[i]-1; //this is the correct index of element

            if(input[i] != input[correct]){
                swap(input, i, correct);
            }else{
                i++;
            }


        }
        System.out.println(Arrays.toString(input));
        for (int j = 0; j < input.length; j++) {

            if(input[j] !=  j+1){
                ans.add(j+1);

            }

        }

        return ans;

    }

    private static void swap(int[] input, int i, int correct) {
        int temp = input[i];
        input[i] = input[correct];
        input[correct] =temp;
    }


    //when the



}

