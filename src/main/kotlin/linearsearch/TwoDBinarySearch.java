package linearsearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoDBinarySearch {

    public static void main(String[] args) {

        int[][] input = {
                {10,20,30,40},
                {15,25,35, 45},
                {28,29, 37, 49},
                {33,34,38,50}
        };

        int[] out = twoDSEarch(input, 49);
        System.out.println(Arrays.toString(out));
    }

    //this method is used to search on a not strictly sorted matrix

    static int[] twoDSEarch(int[][] input, int target){

        int row = 0;
        int colum = input.length-1;

        while(row<input.length && colum>=0){

            if(input[row][colum] ==target){
                return new int[]{row,colum};
            }

            if (input[row][colum]< target){
                row++;

            }else {
                colum--;
            }

        }

        return new int[]{-1,-1};
    }


    static int[] twoDStrictSorting(int [][] input, int target){

        int rows = input.length;
        int col = input[0].length;// be cautions, matrix might be empty


        return new int[]{-1,-1};
    }
}
