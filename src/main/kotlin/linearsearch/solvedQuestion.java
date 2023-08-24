package linearsearch;

import org.jetbrains.annotations.Contract;

public class solvedQuestion {



    public static void main(String[] args) {
        int [] nums = {12,345,2, 6,7896, 1896};
        System.out.println(NumberofEvenNumbers(nums));


    }


    static int NumberofEvenNumbers(int [] input){

        int initialEvenElement = 0;
        for (int i = 0; i < input.length; i++) {

            if( isEven(input[i])){

                initialEvenElement++;
            };

        }

        return initialEvenElement;
    }

    static Boolean isEven(int input){
        int count = countNumber(input);
        return count % 2 == 0;
    }

    static int countNumber(int input){
        int initialCountValue =0;

        while(input>0){
            initialCountValue++;
            input = input / 10;

        }
        return initialCountValue;
    }

}
