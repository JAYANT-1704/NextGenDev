import java.util.*;

public class game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        char again;
        int tround = 0;
        int tattempt = 0;
        int rwon = 0;

        do {
            int num = ran.nextInt(100) + 1;
            int guess;
            int atmpt = 0;
            final int maxatmpt = 10;
            boolean check = false;

            System.out.println("Guess the num between 1 and 100: ");
            while (atmpt < maxatmpt) {
                guess = sc.nextInt();
                atmpt++;
                if (guess == num) {
                    System.out.println("Congratulations! You guessed the num in " + atmpt + " atmpt.");
                    check = true;
                    rwon++;
                    break;
                } else if (guess > num) {
                    System.out.println("Too high! Try again: ");
                } else {
                    System.out.println("Too low! Try again: ");
                }
            }

            if (!check) {
                System.out.println("Sorry, you've used all " + maxatmpt + " atmpt. The num was " + num + ".");
            }

            tround++;
            tattempt += atmpt;

            System.out.print("Do you want to play again? (y/n): ");
            again = sc.next().charAt(0);
        } while (again == 'y' || again == 'Y');

        System.out.println("You played " + tround + " rounds with a total of " + tattempt + " atmpt.");
        System.out.println("Rounds won: " + rwon);
        System.out.println("Average atmpt per round: " + (double) tattempt / tround);

    }
}