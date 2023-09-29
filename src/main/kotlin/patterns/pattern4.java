package patterns;


/**
 *
 * *
 * * *
 * * * *
 * * * * *
 * * * *
 * * *
 * *
 *
 * */


public class pattern4 {

    public static void main(String[] args) {
        pattern4(4);


    }


    public static void pattern4(int n) {


        for (int row = 0; row < 2*n; row++) {

            int totalcolumrange = row>n ? 2*n - row: row;

            for (int colum = 0; colum < totalcolumrange ; colum++) {

                System.out.print("* ");
            }

            System.out.println();

        }

    }
}
