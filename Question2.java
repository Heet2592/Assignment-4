public class Question2 {
    public static void main(String[] args) {
        String a = "aaaatttwwsssrrtt";
        int lenght = a.length();

        char[] store = new char[lenght];

        for (int i = 0; i < lenght; i++) {
            store[i] = a.charAt(i);
        }

        for (char c : store) {
            System.out.print(" " + c);
        }
        System.out.println();

        int counter = 0;
        char temp1;

        for (int i = 0; i < store.length; i++) {
            for (int j = 1; j < store.length; j++) {
                if (store[j] < store[j - 1]) {
                    char temVar = store[j];
                    store[j] = store[j - 1];
                    store[j - 1] = temVar;
                }
            }

        }
        for (char c : store) {
            System.out.print(" " + c);
        }
        System.out.println();
        for (int i = 0; i < store.length; i++) {

            for (int j = i + 1; j < store.length; j++) {
                if (store[i] == store[j]) {
                    counter++;
                    store[j] = ' ';
                }

            }
            if (store[i] != ' ') {
                System.out.println("Found " + store[i] + " " + counter + " times");

            }
            counter = 0;
        }
    }
}