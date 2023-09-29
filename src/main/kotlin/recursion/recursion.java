package recursion;

public class recursion {

    public static void main(String[] args) {


        int[] input = {1,2,3,4,5,6,7,8,9};
        int target = 4;
        int output = RecursiveBinarySearch(input, target, 0, input.length-1);
        System.out.println(output);


    }


    static int fibonacci( int n){

        if(n < 2){
            return  n;
        }

        return fibonacci(n-1) +  fibonacci(n-2);

    }


    static  int RecursiveBinarySearch(int[] input, int target, int start, int end){

        if(start> end){ // this is the base condition and should be checked first before any other thing
            return -1;
        }

        int midpoint= start +(end-start)/2; // this is the body of the recursion

        if(target == input[midpoint]){
            return  midpoint;
        }

        if (target> input[midpoint]){
            return RecursiveBinarySearch(input, target, midpoint+1,  end);
        }

        return RecursiveBinarySearch(input,target, start, midpoint-1);




    }




}
