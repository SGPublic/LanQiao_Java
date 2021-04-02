import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        scanner.close();
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        ArrayList<Character> array = new ArrayList<>();
        for (int index = 0; index < m; index++){
            char current = (char) ('A' + index);
            array.add(current);
        }
        println(array);
        char start = 'A';
        char end = (char) ('A' + m - 1);
        int next = 1;
        for (int line = 1; line < n; line++){
            if (array.get(0) == start){
                next = 1;
            } else if (array.get(0) == end){
                next = -1;
            }
            array.add(0, (char) (array.get(0) + next));
            array.remove(array.size() - 1);
            println(array);
        }
    }

    private static void println(ArrayList<Character> array){
        array.forEach(new Consumer<Character>() {
            @Override
            public void accept(Character character) {
                System.out.print(character);
            }
        });
        System.out.print("\n");
    }
}
