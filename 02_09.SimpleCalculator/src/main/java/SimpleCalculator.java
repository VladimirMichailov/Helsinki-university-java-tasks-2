
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int numb1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        int numb2 = Integer.parseInt(scanner.nextLine());
        long plus = numb1 + numb2;
        long minus = numb1 - numb2;
        long multi = numb1 * numb2;
        double part = (double)numb1 / numb2;

        System.out.println(+numb1+" + "+numb2+" = "+plus);
        System.out.println(+numb1+" - "+numb2+" = "+minus);
        System.out.println(+numb1+" * "+numb2+" = "+multi);
        System.out.println(+numb1+" / "+numb2+" = "+part);
    }
}
