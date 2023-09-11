package BinarySearch.solvedquestion;

import java.util.Arrays;

/***
 *
 * given an array of integers num sorted in Ascending order, find the starting and
 * ending position of a given target value
 * if the target is not found return [-1,-1]
 * //solution
 *
 */

public class orderagnosticarray {

    public static void main(String[] args) {
        int[] input = {5,7,7,8,8,8,10};

        int[] output = IndexpositionIntheArray(input, 8);
        System.out.println(Arrays.toString(output));

    }

    static int[] IndexpositionIntheArray(int [] input, int target){
        int[] answer = {-1,-1};

        answer[0]= findOccurence(input, target, true);
        answer[1] = findOccurence(input, target,false);

        return  answer;
    }







    static int findOccurence(int[] input, int target, Boolean lookingforfirstOccurance){
        int ans = 0;
        int start =0;
        int end =input.length-1;

        while (start<=end){

            int midpoint = start+ (end-start)/2;

            if(target> input[midpoint]){
                start =midpoint +1;
            } else if (target<input[midpoint]) {
                end = midpoint-1;

            }else {
                ans = midpoint;
                // when the first occurence is found reset the end with the midpointValue
                // to look for the first occurance
                if(lookingforfirstOccurance){
                    end = midpoint -1;

                    // when the first occurance is found reset the start position to
                    // search for the last occurance
                }else {
                    start =midpoint+1;
                }

            }
        }
        return ans;
    }

}
