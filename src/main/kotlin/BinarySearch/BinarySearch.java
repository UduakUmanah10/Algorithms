package BinarySearch;

public class BinarySearch
{
    public static void main(String[] args) {

        int [] num = {1,2,3,4,5,6,7};
        int[] des = {9,8,7,6,5,4,3,2,1};
        int out = orderAgnosticBinarySearch(num, 4);
        int in = orderAgnosticBinarySearch(des, 5);
        System.out.println(out);
        System.out.println(in);

    }


    static int AscBinarySearch(int []input, int target){

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
                return mid;
            }

        }

        return 0;
    }






    static int DesBinarySearch(int []input, int target){

        int start =0;
        int end = input.length-1;

        while (start < end){
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
