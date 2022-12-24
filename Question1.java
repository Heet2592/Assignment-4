public class Question1 {
    public static void main(String[] args) {
        String a = "aabbccddee";
        int lenght = a.length();

        char[] store = new char[lenght];

        for (int i = 0; i < lenght; i++) {
            store[i] = a.charAt(i);
        }

        for (char c : store) {
            System.out.print(" " + c);
        }
        System.out.println();

        String temp1 = "";

        for (int i = 0; i < store.length; i++) {
            for (int j = i + 1; j < store.length; j++) {
                if (store[i] == ' ') {
                    break;
                }
                if (store[i] == store[j]) {
                    store[j] = ' ';
                }
            }
        }

        System.out.println();
        for (int i = 0; i < store.length; i++) {
            if (!(store[i] == ' ')) {
                temp1 += store[i];
            }
        }
        System.out.println(temp1);

    }
}