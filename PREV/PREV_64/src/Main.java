import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        AdvanceArray array = new AdvanceArray();
        for (int i = 0; i < n; i++){
            array.add(Integer.parseInt(scanner.nextLine()));
        }
        System.out.println(array.getMaxValue());
        System.out.println(array.getMinValue());
        System.out.println(array.getAverageValue(2));
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

    public String getAverageValue(int length){
        StringBuilder pattern = new StringBuilder("0.");
        for (int i = 0; i < length; i++){
            pattern.append("0");
        }
        return new DecimalFormat(pattern.toString()).format(
                (double) sum / this.size()
        );
    }
}
