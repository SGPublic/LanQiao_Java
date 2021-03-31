import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        scanner.close();
        for (long i = 10001; i <= 999999; i++){
            String[] s = String.valueOf(i).split("");
            if (judge(s, n)){
                System.out.println(i);
            }
        }
    }

    public static boolean judge(String[] args, int n){
        int length = args.length - 1;
        int add = 0;
        for (int i = 0; i < length / 2 + 1; i++) {
            int start = Integer.parseInt(args[i]);
            int end = Integer.parseInt(args[length - i]);
            if (start != end){
                return false;
            }
            add += start;
            if (i == length - i){
                continue;
            }
            add += end;
        }
        return add == n;
    }
}
