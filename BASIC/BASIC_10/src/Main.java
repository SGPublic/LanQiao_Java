import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num10 = scanner.nextLine();
        scanner.close();
        System.out.println(new BigInteger(num10, 10).toString(16));
    }
}