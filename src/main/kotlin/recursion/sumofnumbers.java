package recursion;

public class sumofnumbers {

    public static void main(String[] args) {
        int ans  = product(1342);
        System.out.println(ans);

    }


    static int sumofNumber(int n){
        if(n==0){
            return 0;
        }
         return  (n%10) + sumofNumber(n/10);
    }


    static int product(int n){
        if(n % 10 == n){    // this is because 1 % 10 = 1 the n that is compared is that which is in the functiom
            return n;
        }
        return  (n % 10) * product(n/10);
    }
}
