import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String[] s = scanner.nextLine().split(" ");
        int a = Integer.parseInt(scanner.nextLine());
        scanner.close();
        ArrayList<Integer> array = new ArrayList<>();
        for (String index : s){
            array.add(Integer.parseInt(index));
        }
        int index = array.indexOf(a);
        if (index >= 0){
            index++;
        }
        System.out.println(index);
    }
}