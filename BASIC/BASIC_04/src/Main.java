import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        scanner.close();
        if (n == 1){
            System.out.println(1);
            return;
        } else if (n == 2){
            System.out.println(1);
            return;
        }
        int f_n2 = 1;
        int f_n1 = 1;
        int f_n = 2;
        for (int i = 2; i < n; i++){
            f_n = (f_n2 + f_n1) % 10007;
            f_n2 = f_n1;
            f_n1 = f_n;
        }
        System.out.println(f_n);
    }
}
