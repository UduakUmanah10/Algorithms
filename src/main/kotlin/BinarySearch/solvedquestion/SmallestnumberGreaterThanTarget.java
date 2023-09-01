package BinarySearch.solvedquestion;

public class SmallestnumberGreaterThanTarget {

    public static void main(String[] args) {

        char[] input = {'c','f','j'};
        char target = 'd';

        char out= newSearch(input, target);
        System.out.println(out);
     }



    static char newSearch(char []input, int target){

        int start =0;
        int end = input.length-1;

        while (start <= end){

            int mid = start + (end-start )/2;

            if(target < input[mid]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }

        }

        return input[start % input.length];
    }

}
