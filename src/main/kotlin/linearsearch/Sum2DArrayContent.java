package linearsearch;

public class Sum2DArrayContent {
    public static void main(String[] args) {

        int[][] accounts = {{1,2,3}, {3,2,1}};
        System.out.println(maximumWealth(accounts));

    }

    public static int maximumWealth(int[][] accountContent){
        int currentMax = 0;
        for (int person = 0; person <accountContent.length ; person++) {
            int currentSum = 0;
            for (int account = 0; account < accountContent[person].length; account++) {
                currentSum += accountContent[person][account];
            }
                currentMax += currentSum;
        }return  currentMax;
    }

}
