import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println("1");
        System.out.println("1 1");
        ArrayList<Integer> pre = new ArrayList<>();
        pre.add(1);
        pre.add(1);
        for (int i = 3; i <= n; i++){
            pre = nextLine(pre, i);
        }
    }

    private static ArrayList<Integer> nextLine(ArrayList<Integer> pre, int n){
        ArrayList<Integer> current = new ArrayList<>();
        for (int i = 0; i < n; i++){
            if (i == 0){
                current.add(1);
                System.out.print(1);
                continue;
            }
            if (i == n - 1){
                current.add(1);
                System.out.print(" 1\n");
                break;
            }
            int currentNum = pre.get(i - 1) + pre.get(i);
            current.add(currentNum);
            System.out.print(" " + currentNum);
        }
        return current;
    }
}
