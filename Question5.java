import java.util.Arrays;

public class Question5 {
    public static void main(String[] args) {
        String s1 = "act";
        String s2 = "cat";

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char[] char1 = new char[s1.length()];
        char[] char2 = new char[s2.length()];

        for (int i = 0; i < char1.length; i++) {
            char1[i] = s1.charAt(i);
        }
        for (int i = 0; i < char2.length; i++) {
            char2[i] = s1.charAt(i);
        }

        for (int i = 0; i < char1.length; i++) {
            for (int j = 1; j < char1.length; j++) {
                if (char1[j] > char1[j - 1]) {
                    char temp = char1[j - 1];
                    char1[j - 1] = char1[j];
                    char1[j] = temp;
                }
            }
        }
        for (int i = 0; i < char2.length; i++) {
            for (int j = 1; j < char2.length; j++) {
                if (char2[j] > char2[j - 1]) {
                    char temp = char2[j - 1];
                    char2[j - 1] = char2[j];
                    char2[j] = temp;
                }
            }
        }
        if (Arrays.equals(char1, char2)) {
            System.out.println("String is Anagram");
        } else {
            System.out.println("String is not Anagram");
        }

    }
}
