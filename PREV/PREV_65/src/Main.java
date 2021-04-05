import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] word = scanner.nextLine().toCharArray();
        scanner.close();
        int[] count = new int[26];
        for (char index : word){
            count[index - 'a']++;
        }
        int maxIndex = 0;
        int maxCount = 0;
        for (int index = 0; index < count.length; index++){
            if (count[index] > maxCount){
                maxCount = count[index];
                maxIndex = index;
            }
        }
        System.out.println((char) ('a' + maxIndex));
        System.out.println(maxCount);
    }
}
