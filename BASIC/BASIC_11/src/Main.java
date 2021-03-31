import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num16 = scanner.nextLine();
        System.out.println(new BigInteger(num16, 16).toString(10));
    }
}
