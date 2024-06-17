
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int numb1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        int numb2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the third number:");
        int numb3 = Integer.parseInt(scanner.nextLine());


        double result = (numb1 + numb2 + numb3) / 3.0;
        System.out.println("The average is "+result);

    }
}
