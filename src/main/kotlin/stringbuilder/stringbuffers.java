package stringbuilder;

import java.util.Random;

public class stringbuffers {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer(20);
        sb.append("wakes me up");

        String random = RandomStringgenerator.GenerateString(6);
        System.out.println(random);


    }
}
