package stringbuilder;

public class stringmethods {
    public static void main(String[] args) {
        String name ="abcdcba";
        System.out.println(Palindrim2(name));

    }



    static Boolean Palindrime(String str){

        if(str == null  || str.isEmpty()){
            return true;
        }

        str = str.toLowerCase();
        char[] x = str.toCharArray();
        for (int i = 0; i < str.length()/2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() -1 -i);

            if(start !=  end){
                return  false;
            }


        }


        return true;

    }
    static Boolean Palindrim2(String str){

        str = str.toLowerCase();
        char[] x = str.toCharArray();
        for (int i = 0; i < x.length/2; i++) {
            char start = x[i];
            char end = x[x.length -1 -i];

            if(start !=  end){
                return  false;
            }


        }


        return true;

    }
}
