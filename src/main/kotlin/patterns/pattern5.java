package patterns;
/**
 *
 *     *
 *    * *
 *   * * *
 *  * * * *
 * * * * * *
 *  * * * *
 *   * * *
 *    * *
 *     *
 */

public class pattern5 {

    public static void main(String[] args) {
        pattern5(5);

    }

    public static void pattern5(int n) {


        for (int row = 0; row < 2*n; row++) {

            int totalcolumrange = row>n ? 2*n - row: row;

            int noofSpaces = n-totalcolumrange;

            for (int i = 0; i < noofSpaces; i++) {
                System.out.print(" ");

            }

            for (int colum = 0; colum < totalcolumrange ; colum++) {

                System.out.print("* ");
            }

            System.out.println();

        }

    }
}
