package mathsfordsa;

public class modulusproperty {

    public static void main(String[] args) {

    }
    //Hcf is the minimum value of ax+by
    // where x and y are int


    static int gcd (int a, int b){

        if(a == 0){
            return  b;

        }

        return gcd(b%a,  a);
    }

}
