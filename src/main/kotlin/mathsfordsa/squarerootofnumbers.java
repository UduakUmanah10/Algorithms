package mathsfordsa;

public class squarerootofnumbers {

    public static void main(String[] args) {

        int number = 40;
        int precision = 3;

        System.out.println(Squareroot(number, precision));

    }

    private static double Squareroot(int number, int precision) {

        int start = 0;
        int end = number;
        double root = 0.0;

        while (start<= end){

            int midpoint = start +(end -start)/2;

            if(midpoint *midpoint == number){
                return  midpoint;
            }

            if(midpoint *midpoint > number){
                end = midpoint-1;
            }else{
                start = midpoint +1;
            }

        }

        double  incr = 0.1;

        for (int i = 0; i < precision; i++) {

            while(root * root <= number){
                root += incr;
            }

            root -=incr;
            incr = incr/10;

        }

return  root;
    }
}
