package sortAlgorithms;

public class calculatingmissingNumber {

    public static void main(String[] args) {

        int[] input = {4,0,2,1};
        int missing = MissingNumber(input);
        System.out.println(missing);

    }

    static int MissingNumber(int[] inputArray){
        int startPoint = 0;

        while (startPoint < inputArray.length){
            int correctIndex = inputArray[startPoint];

            //for revision purposes this is an important check parameter to prevent out of bound exception
            if( inputArray[startPoint] < inputArray.length && inputArray[startPoint] != inputArray[correctIndex]){
                swap(inputArray, startPoint, correctIndex);
            }else {
                startPoint++;
            }
        }


        for (int index = 0; index < inputArray.length; index++) {
            if(inputArray[index]!= index){
                return index;
            }
        }
        return inputArray.length;
    }



    private static void swap(int[] inputArray, int first, int second) {
        int temp = inputArray[first];
        inputArray[first] = inputArray[second];
        inputArray[second]= temp;
    }
}
