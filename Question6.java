public class Question6 {
    public static void main(String[] args) {
        String s1 = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        boolean flag = false;
        s1 = s1.replace(" ", "");

        char[] ch = s1.toCharArray();
        int[] ar = new int[26];

        for (int i = 0; i < ch.length; i++) {
            int index = ch[i] - 65;
            ar[index]++;
            // ar[ch(i)-65]++
        }
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == 0) {
                System.out.println("Not Pangram");
                flag = true;
            }
        }
        if (flag == false) {
            System.out.println("String is Pangram");
        }

    }
}
