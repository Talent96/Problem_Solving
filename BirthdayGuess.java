package ClassWork;

import java.util.Scanner;

public class BirthdayGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myBirthday = 19;
        int guess;

        do {
            System.out.println("Enter your guess:");
            guess = scanner.nextInt();
            if(guess == myBirthday) System.out.println("Correct");
            else System.out.println("Incorrect, try again");
        } while (guess != myBirthday);
        
    }
}
