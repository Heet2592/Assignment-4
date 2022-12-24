public class Question4 {
    public static void main(String[] args) {
        String a = "Hello@8!";

        int vowelCounter = 0;
        int consonantCounter = 0;
        int specialCounter = 0;
        a = a.toLowerCase();

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o'
                    || a.charAt(i) == 'u') {
                vowelCounter++;
            } else if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') {

                consonantCounter++;
            } else {
                specialCounter++;
            }
        }
        System.out.println("Number of vowels : " + vowelCounter);
        System.out.println("Number of consonants : " + consonantCounter);
        System.out.println("Number of special character : " + specialCounter);
    }
}