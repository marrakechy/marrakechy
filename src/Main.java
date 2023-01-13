

import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int rightInt = rand.nextInt(10);

        do {
            System.out.println("enter a number between 0 and 10");
            int guess = input.nextInt();

            if (guess<= 10 && guess >= 0) {
                if (guess > rightInt) {
                    System.out.println("this number is too high");

                } else if (guess < rightInt) {
                    System.out.println("this number is too low");

                } else if (guess == rightInt) {
                    System.out.println("this number is correct");
                    break;
                }
            }
            else
            { System.out.println("this number is not in the range");}

        } while (true);

    }

}