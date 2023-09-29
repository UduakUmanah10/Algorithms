package BinarySearch.solvedquestion;

public class mountainarray {

    public static void main(String[] args) {

        int[] input = {1,2,3,5,6,7,8,4,3,2};
        System.out.println(peakelementinMountainArray(input));

    }

    static int peakelementinMountainArray(int[] input){
        int ans =0;
        int start = 0;
        int end = input.length-1;

        while (start < end){
            int mid = start+(end -start)/2;

            if(input[mid] > input[mid+1]){
                end = mid;
            }else{
                 start = mid+1;
            }
        }

        return input[start];

    }


}
