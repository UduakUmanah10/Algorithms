package BinarySearch;

import java.util.Arrays;

public class MatrixBinarySearch {

    public static void main(String[] args) {

        int [][] input = {{1,2,3,},{4,5,6},{7,8,9}};

        int[] output = binarySearch(input, 6);

        System.out.println(Arrays.toString(output));

    }

    static int[] binarySearch(int[][] input, int target){

        int row = input.length;
        int columSize = input[0].length;

        int start = 0;
        int end = row*columSize -1;

        while (start<=end){

            int midpoint = start+(end-start)/2;

            int matrixMidpoint = input[midpoint/columSize][midpoint%columSize];

            if(target == matrixMidpoint){
                return new int[]{midpoint/columSize, midpoint%columSize};
            }
            else if(target<=matrixMidpoint){
                 end = midpoint+1;
            }
            else {
                start = midpoint-1;
            }
        }

        return new int[]{-1,-1};
    }


}
