package mathsfordsa;

public class factorofanumber {

    public static void main(String[] args) {

    }
    // because the two multiples are  divisible by the number
    // only check till the square root.


    public  static void factor(int input){

        for (int i = 0; i < Math.sqrt(input); i++) {

            if(input  % i  == i){
                System.out.println (i);
            }else {
                System.out.println(i + " "+ input/i);
            }


        }


    }







}
