import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner JavaInput = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = JavaInput.nextLine();
        System.out.println("Hello " + name + ". Please enter a number between 1 and 100:");
        int number = JavaInput.nextInt();
        if ((number < 1) || (number > 100)) {
            System.out.println("Sorry, " + name + " you entered an invalid number.");
            System.exit(0);
        }
        int oddOrEven = number % 2;
        if (oddOrEven == 1) {
            if (number > 60) {
                System.out.println("Odd and over 60.");
            }
            if (number < 60){
                System.out.println(name + " your number is odd.");
            }
        }

        if (oddOrEven == 0) {
            if ((number >= 2) && (number <= 25)) {
                System.out.println(name + " your number is even and less than 25");
            }
            else if (number >= 26){
                System.out.println("Even");
            }
            }
        }
    }
