import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String[] s = scanner.nextLine().split(" ");
        AdvanceArray array = new AdvanceArray();
        for (String index : s){
            array.add(Integer.parseInt(index));
        }
        System.out.println(array.getMaxValue());
        System.out.println(array.getMinValue());
        System.out.println(array.getSumValue());
    }
}

class AdvanceArray extends ArrayList<Integer> {
    private int max = 0;
    private boolean maxDeclare = false;
    private int min = 0;
    private boolean minDeclare = false;
    private int sum = 0;

    @Override
    public boolean add(Integer integer) {
        sum += integer;
        if (!maxDeclare | integer > max){
            maxDeclare = true;
            max = integer;
        }
        if (!minDeclare | integer < min){
            minDeclare = true;
            min = integer;
        }
        return super.add(integer);
    }

    public int getMaxValue(){
        return max;
    }

    public int getMinValue(){
        return min;
    }

    public int getSumValue(){
        return sum;
    }
}

