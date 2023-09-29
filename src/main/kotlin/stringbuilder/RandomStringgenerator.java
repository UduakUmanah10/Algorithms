package stringbuilder;

import java.util.Random;

public class RandomStringgenerator {

    public static  String GenerateString(int BufferSize){

        StringBuffer generatedString = new StringBuffer(BufferSize);
        Random random = new Random();

        for (int i = 0; i < BufferSize; i++) {

            int characterIndex = 97+ (int )(random.nextFloat()*26);
            generatedString.append((char)(characterIndex));

        }

        return generatedString.toString();

    }
}
