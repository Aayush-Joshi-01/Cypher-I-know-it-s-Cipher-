import java.util.HashMap;

public class MorseCodeTranslator {

    private static final HashMap<Character, String> MORSE_CODE_DICT = new HashMap<>();
    private static final HashMap<String, Character> REVERSE_DICT = new HashMap<>();

    static {
        MORSE_CODE_DICT.put('A', ".-");
        MORSE_CODE_DICT.put('B', "-...");
        MORSE_CODE_DICT.put('C', "-.-.");
        MORSE_CODE_DICT.put('D', "-..");
        MORSE_CODE_DICT.put('E', ".");
        MORSE_CODE_DICT.put('F', "..-.");
        MORSE_CODE_DICT.put('G', "--.");
        MORSE_CODE_DICT.put('H', "....");
        MORSE_CODE_DICT.put('I', "..");
        MORSE_CODE_DICT.put('J', ".---");
        MORSE_CODE_DICT.put('K', "-.-");
        MORSE_CODE_DICT.put('L', ".-..");
        MORSE_CODE_DICT.put('M', "--");
        MORSE_CODE_DICT.put('N', "-.");
        MORSE_CODE_DICT.put('O', "---");
        MORSE_CODE_DICT.put('P', ".--.");
        MORSE_CODE_DICT.put('Q', "--.-");
        MORSE_CODE_DICT.put('R', ".-.");
        MORSE_CODE_DICT.put('S', "...");
        MORSE_CODE_DICT.put('T', "-");
        MORSE_CODE_DICT.put('U', "..-");
        MORSE_CODE_DICT.put('V', "...-");
        MORSE_CODE_DICT.put('W', ".--");
        MORSE_CODE_DICT.put('X', "-..-");
        MORSE_CODE_DICT.put('Y', "-.--");
        MORSE_CODE_DICT.put('Z', "--..");
        MORSE_CODE_DICT.put('1', ".----");
        MORSE_CODE_DICT.put('2', "..---");
        MORSE_CODE_DICT.put('3', "...--");
        MORSE_CODE_DICT.put('4', "....-");
        MORSE_CODE_DICT.put('5', ".....");
        MORSE_CODE_DICT.put('6', "-....");
        MORSE_CODE_DICT.put('7', "--...");
        MORSE_CODE_DICT.put('8', "---..");
        MORSE_CODE_DICT.put('9', "----.");
        MORSE_CODE_DICT.put('0', "-----");
        MORSE_CODE_DICT.put('&', ".-...");
        MORSE_CODE_DICT.put('@', ".--.-.");
        MORSE_CODE_DICT.put(':', "---...");
        MORSE_CODE_DICT.put(',', "--..--");
        MORSE_CODE_DICT.put('.', ".-.-.-");
        MORSE_CODE_DICT.put('\'', ".----.");
        MORSE_CODE_DICT.put('"', ".-..-.");
        MORSE_CODE_DICT.put('?', "..--..");
        MORSE_CODE_DICT.put('/', "-..-.");
        MORSE_CODE_DICT.put('=', "-...-");
        MORSE_CODE_DICT.put('+', ".-.-.");
        MORSE_CODE_DICT.put('-', "-....-");
        MORSE_CODE_DICT.put('(', "-.--.");
        MORSE_CODE_DICT.put(')', "-.--.-");
        MORSE_CODE_DICT.put('!', "-.-.--");
        MORSE_CODE_DICT.put(' ', "/");

        for (char key : MORSE_CODE_DICT.keySet()) {
            REVERSE_DICT.put(MORSE_CODE_DICT.get(key), key);
        }
    }

    public static String encrypt(String message) {
        StringBuilder result = new StringBuilder();
        message = message.toUpperCase();
        for (int i = 0; i < message.length(); i++) {
            char charToEncrypt = message.charAt(i);
            if (MORSE_CODE_DICT.containsKey(charToEncrypt)) {
                result.append(MORSE_CODE_DICT.get(charToEncrypt)).append(" ");
            }
        }
        return result.toString().trim();
    }

    public static String decrypt(String message) {
        StringBuilder result = new StringBuilder();
        String[] words = message.split(" ");
        for (String word : words) {
            if (REVERSE_DICT.containsKey(word)) {
                result.append(REVERSE_DICT.get(word));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String message = "Morse code here!";
        System.out.println(message);
        message = encrypt(message);
        System.out.println(message);
        message = decrypt(message);
        System.out.println(message);
    }
}
