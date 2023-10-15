package bitwiseoperators;

public class bitwiseoperators {

    public static void main(String[] args) {
        Boolean ans = isOddorEven(68);
        int[] arr = {2,3,3,4,2,6,4};
        int s =1;
        int[] input = {1,3,6,4,1,2};

        System.out.println(NonrepeatingNumber(arr));




        System.out.println(unique(arr));

    }

    public static boolean isOddorEven(int n){

        return (n & 1) == 1;

    }


    public static int NonrepeatingNumber(int [] input){
        int initial = 0;

        for (int i = 0; i < input.length; i++) {
            initial ^=i;

        }
        return initial;
    }
    
    public static int unique(int [] input){
        int ans = 0;
        for (int i = 0; i < input.length; i++) {
            ans ^=input[i] ;

        }

        return ans;
    }


    public static  int solution(int[] A) {

        if(A[A.length -1]<0){
            return 1;
        }

        int start = 0;
        int end = A.length;

        while(start<end){
            int correct = A[start]-1;
            if(A[start]!= A[correct]){

                swap(A, start, correct);
            }else{
                start++;
            }
        }

        for(int i=0; i<A.length; i++){
            if(A[i] != i+1){
                return i+1;
            }
        }



        return A.length+1;

    }

    public static void swap(int [] input, int first, int second){

        int temp= input[first];
        first = input[second];
        second=temp;
    }
}
