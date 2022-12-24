public class Question8 {
    public static void main(String[] args) {
        String a = "Thisstringfindsmaximunnumberofoccurranceofacharacter";
        int lenght = a.length();

        char[] store = new char[lenght];

        for (int i = 0; i < lenght; i++) {
            store[i] = a.charAt(i);
        }
        System.out.println();

        int counter = 0;
        int max = 0;
        char a1 = ' ';
        for (int i = 0; i < store.length; i++) {
            for (int j = 1; j < store.length; j++) {
                if (store[j] < store[j - 1]) {
                    char temVar = store[j];
                    store[j] = store[j - 1];
                    store[j - 1] = temVar;
                }
            }

        }

        for (int i = 0; i < store.length; i++) {

            for (int j = i + 1; j < store.length; j++) {
                if (store[i] == store[j]) {
                    counter++;
                    store[j] = ' ';
                }

            }

            if (store[i] != ' ') {

                if (max < counter) {
                    max = counter;
                    a1 = store[i];
                }
            }
            counter = 0;
        }

        System.out.println("Character " + a1 + " Occurred " + max + " times");
    }
}