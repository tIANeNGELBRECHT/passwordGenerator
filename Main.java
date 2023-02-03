import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        assemblePass();
    }


    public static char randomLetter() {

        String alphaLetters = "abcdefghijklmnopqrstuvwxyz";

        Random random = new Random();
        int randomLetter = random.nextInt(25);

        return alphaLetters.charAt(randomLetter);

    }

    public static char randomChar() {

        String characters = "!@#$%&*?";

        Random random = new Random();
        int randomCharNum = random.nextInt(7);

        return characters.charAt(randomCharNum);

    }

    public static int randNum() {

        Random random = new Random();
        int randomNumber = random.nextInt(9);

        return randomNumber;

    }

    public static void assemblePass() {

        System.out.println("Your new generated password is: ");

        for (int i = 0; i < 4; i ++) {
            Object[] guessObject = new Object[]{randomLetter(), randNum(), randomChar(), Character.toUpperCase(randomLetter())};
            Random random = new Random();

            for (int f = 0; f < guessObject.length; f++) {

                int indexSwap = random.nextInt(guessObject.length);
                Object swap = guessObject[indexSwap];

                guessObject[indexSwap] = guessObject[f];
                guessObject[f] = swap;
            }

            for (int j = 0; j < guessObject.length; j++) {

                System.out.print((guessObject[j]));

            }

            if (i < 3) {
                System.out.print("-");
            }
        }

    }
}