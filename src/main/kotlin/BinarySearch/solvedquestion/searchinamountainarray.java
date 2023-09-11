package BinarySearch.solvedquestion;

public class searchinamountainarray {

    public static void main(String[] args) {
        int [] input = {1,2,3,4,5,3,1};
        int[] peak = {1,2,3,4,5,4,3,1};
       // System.out.println(peakelementinMountainArray(peak));
        int output = search(input, 2);
        System.out.println(output);

    }





static int  search(int [] input, int target){

        int peakelement = peakelementinMountainArray(input);
        int firstTry = orderAgnosticBinarySearch(input, target, 0, peakelement);

        if(firstTry != -1){
            return firstTry;
        }

        return orderAgnosticBinarySearch(input,target, peakelement+1, input.length-1);



}


    static int peakelementinMountainArray(int[] input){
        int start = 0;
        int end = input.length-1;

        while (start < end){
            int mid =  start + (end -start)/2;

            if(input[mid] > input[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
        }

        return start;

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

        return -1;
    }






    static int DesBinarySearch(int []input, int target, int start, int end){


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
        return -1;
    }

    static int orderAgnosticBinarySearch(int []input, int target, int  Start, int end){

        // note the condition for checking ascending and descending changes because of
        //the bitonic nature of the array
        boolean isAscending = input[0]< input[1];
        if(isAscending){
            return AscBinarySearch(input,target, Start, end);
        }
        else {
            return DesBinarySearch(input, target, Start, end);
        }
    }

}
