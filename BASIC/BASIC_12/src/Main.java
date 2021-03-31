import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<String> num16 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            num16.add(scanner.next());
        }
        scanner.close();
        num16.forEach(new Consumer<String>() {
            @Override
            public void accept(String num16) {
                String num2 = new BigInteger(num16, 16).toString(2);
                System.out.println(new BigInteger(num2, 2).toString(8));
            }
        });
    }
}
