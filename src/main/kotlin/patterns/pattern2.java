package patterns;
/*
*
*
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 * * * * *

 *
* */
public class pattern2 {

    public static void main(String[] args) {

    }

    static  void pattern2(int n){

        // the outside loop should run upto the number of rowe
        //present in the question
        for (int row = 1; row <=n; row++) {

            //look at the relationship between the rows and colums
            //thea is for a row how many colums do you have
            //use that to condition your internal loop

            for (int colum = 1; colum <=n ; colum++) {
                System.out.print("* ");
            }

            // when one row is printed we need to use a nuw line

            System.out.println();
        }
    }
}
