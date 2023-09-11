package BinarySearch.solvedquestion;

public class BinartSearchInRotatedArray {

    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,6,7};
        int highestValue = findMaximumElementInRotatedArray(input)+1;
        System.out.println(highestValue);
    }
    static int AscBinarySearch(int []input, int target, int start, int end){


        while (start <= end){

            int mid = start + (end-start )/2;

            if(target < input[mid]){
                end = mid-1;
            } else if (target > input[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }

        }

        return 0;
    }


    public static int targetinTotatedarray( int[] input, int target){

        int start = 0;
        int end = input.length-1;
        int maxelement = findMaximumElementInRotatedArray(input);

        if(target ==input[maxelement]){
            return maxelement;
        }
        if(target < input[maxelement]){
            return AscBinarySearch(input, target, start, maxelement);
        }
        if(target > input[maxelement]){
            return AscBinarySearch(input, target, maxelement, end);
        }

        return -1;
    }

    public static int findMaximumElementInRotatedArray(int[] input){

        int startPoint = 0;
        int endPoint= input.length-1;

        while (startPoint<=endPoint){
            int midPoint =  startPoint +(endPoint-startPoint)/2;

            /**
             *
             * if the midpoint is greater than the endpoint  then input[midpoint+1]  would be out of bound
             * if iht start point is greater than the startPoint input[midPoint-1]
             * */

            if( midPoint < endPoint && input[midPoint] > input[midPoint+1]){
                return  midPoint;

            }
            if( startPoint < midPoint && input[midPoint] < input[midPoint-1]){
                return  midPoint -1;
            }
            if(input[startPoint] >= input[midPoint]){
                endPoint = midPoint -1;
            }
            else {
                startPoint = midPoint+1;
            }

        }

        /**
         * if -1 is returned it is not a rotated array jus do normal binary search
         **/

        return -1;
    }
    public static int findMaximumElementInRotatedDuplicateArray(int[] input){

        int startPoint = 0;
        int endPoint= input.length-1;

        while (startPoint<endPoint){
            int midPoint =  startPoint +(endPoint-startPoint)/2;

            /**
             *
             * if the midpoint is greater than the endpoint  then input[midpoint+1]  would be out of bound
             * if iht start point is greater than the startPoint input[midPoint-1]
             * */

            if( midPoint < endPoint && input[midPoint] > input[midPoint+1]){
                return  midPoint;

            }
            if( startPoint < midPoint && input[midPoint] < input[midPoint-1]){
                return  midPoint -1;
            }

            /**
             * this condition would fail to hold as the start end and middle values would be same

            if(input[startPoint] >= input[midPoint]){
                endPoint = midPoint -1;
            }
            else {
                startPoint =midPoint+1;
            }
             **/

            if(input[startPoint] == input[endPoint] && input[endPoint] == input[midPoint]){

                if(input[startPoint] > input[startPoint+1]){
                    return startPoint;
                }
                startPoint++;

                if(input[endPoint] < input[endPoint-1]){
                    return endPoint-1;
                }
                endPoint--;

            } else if (input[startPoint]< input[midPoint] || (input[startPoint]== input[midPoint]&& input[midPoint]> input[endPoint])) {
                startPoint =midPoint +1;

            }else {
                endPoint = midPoint-1;
            }


        }

        /**
         * if -1 is returned it is not a rotated array jus do normal binary search
         **/

        return -1;
    }
}
