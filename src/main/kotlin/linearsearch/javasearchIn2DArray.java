package linearsearch;

import java.util.Arrays;

public class javasearchIn2DArray {
    public static void main(String[] args) {
        int [][] arr = new int[][]{
                {23, 4, 1},
                {18, 12,3,9},
                {78, 99,34,56},
                {18,12}
        };

        int find  = maximumElement(arr);
        System.out.println(find);

    }


    static int[] TwoDimesnionsearch(int [][] input, int target){


        for (int row = 0; row < input.length; row++) {
            for (int colum = 0; colum < input[row].length; colum++) {
                if(input[row][colum]==target){
                    return new int[]{row, colum};
                }
            }
        }
        return new int [] {-1, -1};
    }

    static int  maximumElement(int[][] input){

        int min =Integer.MIN_VALUE;

        for (int row = 0; row < input.length; row++) {

            for (int colum = 0; colum < input[row].length; colum++) {

                if(input[row][colum]>min){
                    min = input[row][colum];
                }
            }
        }
        return min;
    }

}
