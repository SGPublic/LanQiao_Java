import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = Integer.parseInt(scanner.nextLine());
        scanner.close();
        String m = new DecimalFormat("0.0000000")
                .format(r * r * Math.atan(1.0) * 4);
        System.out.println(m);
    }
}
