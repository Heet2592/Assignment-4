public class Question7 {
    public static void main(String[] args) {
        String s1 = "abcdef";

        s1 = s1.replace(" ", "");

        char[] ch = s1.toCharArray();

        int counter = 0;
        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    counter++;
                }
            }
        }

        if (!(counter == 0)) {
            System.out.println("String has duplicate characters");
        } else {
            System.out.println("String has no Duplicate character");
        }

    }
}
