import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String[] arrayPre = scanner.nextLine().split(" ");
        ArrayList<Integer> array = new ArrayList<>();
        scanner.close();
        for (String s : arrayPre) {
            int itemInt = Integer.parseInt(s);
            array.add(itemInt);
        }
        array.sort(Comparator.comparingInt(o -> o));
        StringBuilder out = new StringBuilder();
        for (int i : array) {
            if (!out.toString().equals("")) {
                out.append(" ");
            }
            out.append(i);
        }
        System.out.println(out.toString());
    }
}
