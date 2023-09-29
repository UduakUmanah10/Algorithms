package stringbuilder;

public class stringbuillder {

    public static void main(String[] args) {
        String series = "";
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 26; i++) {

            char ch = (char)('a'+i);
            System.out.println(ch);
            builder.append(ch);

        }


    }
}
