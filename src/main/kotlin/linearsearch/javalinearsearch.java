package linearsearch;

public class javalinearsearch {
    public static void main(String[] args) {
        int[] num = {23,45,1,2,8,19,-3,16,-11,28 };
        int target = 199;

        int ElementPosition = linerSearch(num, target);
        int minimumValue = findtheMinimumValue(num);

        System.out.println(minimumValue);
    }


    static int linerSearch(int []arr, int target){

        // if you have an empty array  the array length would be 0 and
        // -1 would be returned
        if(arr.length == 0){
            return -1;
        }

        for(int index =0; index < arr.length; index++){


            //identifying every element in the array with the for loop index
            int element = arr[index];

            //comparing individual element
            if( target == element){
                return index;
            }

        }

        //if the item is not in the list -2 would be returned
        return -2;

    }


    // an alternate way of doing this is to convert the string to charArray
    static boolean findCharacter(String input, char target){
        if(input.length() == 0){
            return false;
        }

        for (int index =0; index<input.length(); index++ ){
            char currentElement = input.charAt(index);
            if(target == currentElement){
                return  true;
            }

        }
        return false;
    }

    static int findtheMinimumValue(int[] arr){
        int temporaryMinmum = arr[0];
        for (int index = 0; index < arr.length; index++) {

            int currentValue = arr[index];
            if(currentValue<temporaryMinmum){
                temporaryMinmum = currentValue;
            }

        }
        return  temporaryMinmum;
    }
}
