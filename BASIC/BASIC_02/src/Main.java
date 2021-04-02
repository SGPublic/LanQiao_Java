import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger n = new BigInteger(scanner.nextLine());
        BigInteger result = n.multiply(n).add(n).divide(new BigInteger("2"));
        System.out.println(result.toString());
    }
}
