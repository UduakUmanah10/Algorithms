package mathsfordsa;

public class optimisedprimenumber {


    public static void main(String[] args) {
        int n = 40;

        int [] check = new int[20];

        boolean [] primes  =  new boolean[n+1];

        sieve(n,primes);


    }


// assume that false means number is prime
    static  void sieve(int num, boolean [] primes){

        for (int i = 2; i*i<= num; i++) {
            if(!primes[i]){
                for (int j = i*2; j <=num ; j+=i) {
                    primes[j] = true;
                }
            }
        }


        for (int i = 2; i <=num ; i++) {
            if(!primes[i]){
                System.out.println(i +"");
            }
        }

    }
}
