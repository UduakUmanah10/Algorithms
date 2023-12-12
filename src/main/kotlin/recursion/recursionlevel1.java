package recursion;

public class recursionlevel1 {
    public static void main(String[] args) {
        jointprint(5);

    }


    static void print(int n){

        if (n==0){
            return;
        }

        System.out.println(n);
        print(n-1);

    }


    static void reverseprint(int n){
        if (n==0){
            return;
        }
        reverseprint(n-1);
        // this would be printed when the recursion is leaving the stack
        System.out.println(n);

    }

    static void jointprint(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        jointprint(n-1);
        // this would be printed when the recursion is leaving the stack
        System.out.println(n);

    }







}
