package BinarySearch.solvedquestion;

public class ceelingofaNumber {
    /**
     * given an array [2,3,5,9,14,15,16,18] and a target of 15 is selected
     * the celing is the smallest number in the array greater or equal to the
     * target element. here the target celing here is 15
     *
     *[solution]
     * note that at the break point start = end+1 because the break condition is as follows
     * while(start<= end){ // do something}
     * therefore array[start] would be your answer
     *
     * for floor of the array[end] would be returned
    * */

    public static void main(String[] args) {
        int[] input = {2,3,5,9,14,15,16,18};
        int output = AscBinarySearch(input, 17);
        System.out.println(output);
    }


    static int AscBinarySearch(int []input, int target){

        if(target> input[input.length-1]){
            return  -1;

        }

        int start =0;
        int end = input.length-1;

        while (start < end){

            int mid = start + (end-start )/2;

            if(target < input[mid]){
                end = mid-1;
            } else if (target > input[mid]){
                start = mid + 1;
            }
            else {
                return input[mid];
            }

        }

        return input[start];
    }






    static int DesBinarySearch(int []input, int target){

        int start =0;
        int end = input.length-1;

        while (start <= end){
            // ues if else condition
            int mid = start + (end-start )/2;
            if(target < input[mid]){
                start = mid+1;
            } else if (target > input[mid]){
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return 0;
    }

    static int orderAgnosticBinarySearch(int []input, int target){
        boolean isAscending =input[0]< input[input.length -1];
        if(isAscending){
            return AscBinarySearch(input,target);
        }
        else {
            return DesBinarySearch(input, target);
        }
    }

}
