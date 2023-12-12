package mathsfordsa;

import java.util.Arrays;

/**
 * a prime number is a number
 * that is divisible by one and itself
 *
 * ignore the first and last  because primr number is divided by it self and 1
 *
 * note 1* 36 = 36
 * 2 * 18 = 36
 * 3 * 12 = 36
 * 4 * 9 = 36
 * 6 * 6 = 36 ==> only make checks for numbers less than the square root
 * 9 *4 = 36
 * 12 * 3 = 36
 * 18 * 2 = 36
 *
 * because of the repetition ignore he buttom part
 *
 */

public class primenumbers {

    public static void main(String[] args) {


        int n = 40;
        boolean[] primes = new boolean[n+1]; // use n+1 because of the zero index

        sieve(n, primes);



        boolean check = primenumber(4);

        System.out.println(Arrays.toString(primes));



    }

    static boolean bruteprimenumber(int input){
        for (int i = 2; i < input; i++) {
            if(input % i > 0 ){
                return  false;
            }
        }
        return  true;
    }

    static  boolean primenumber(int input){
        if (input <=1){
            return  false;
            // 1 is neither prime or composite

        }

        int c =2;

        while (c * c <=input){
            if (input % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
    // fining all elements that lie between 40 that is prime
    // only check till square root


    public static void sieve(int n,boolean[] args) {

        for (int i = 2; i*i <= n; i++) {
            // if args[i] == false
            // let false indicate thet number is prime so make all the multiples of that number to
            // true because 2 & 3 will be true and
            if (!args[i]){

                for (int j = i*2; j <= n; j+=i) {
                    args[j]= true;
                }

            }

        }

        for (int i = 2; i <=n ; i++) {
            if(!args[i]){
                System.out.println(i);
            }
        }

    }

}
