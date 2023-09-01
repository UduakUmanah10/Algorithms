package BinarySearch.solvedquestion;

public class BinarySerrchofinfinitarray {

    public static void main(String[] args) {

        int [] input = {3,5,7,9,10,90,100,130, 140,160,170};
        int target = 10;
        System.out.println(searchWithStartandEnd(input,target));

    }

    static int searchWithStartandEnd(int[] input, int target){
        int start = 0;
        int end = 1;

        while (target > input[end]){// this is because if the target is greater than the end space there would be no
            //need to search in that space
            int newStart = end + 1;
            // double the search radius
            // the size of the search radius can be calculated by (end-start +1)
            // doubling it would be (end -start +1)*2
            // the new end point would = end +(end -start +1)*2
            end = end +(end - start + 1) * 2;
            start = newStart;
        }

        return binarySearch(input,target, start,end);


    }




    //the start and end point are not included in the binary search  but are controlled
    //by another function because we do not know the end point of the array because it is infinite

    static int binarySearch(int[] input, int target, int start, int end){

        while (start <= end){
            int midpoint = start + (end-start)/2;

            if( target == input[midpoint]){
                return  midpoint;
            }

            else if(target > input[midpoint]){
                start = midpoint+1;

            } else if (target< input[midpoint]) {
                end = midpoint-1;

            }

        }

        return -1;
    }
}
