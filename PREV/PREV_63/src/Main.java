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
        System.out.println(array.getCount1());
        System.out.println(array.getCount2());
    }
}

class AdvanceArray extends ArrayList<Integer> {
    private int count_1 = 0;
    private int count_2 = 0;

    @Override
    public boolean add(Integer integer) {
        if (integer >= 85){
            count_2++;
        }
        if (integer >= 60){
            count_1++;
        }
        return super.add(integer);
    }

    public String getCount1(){
        return Integer.valueOf(new DecimalFormat("0").format(
                (double) count_1 / this.size() * 100)
        ) + "%";
    }

    public String getCount2(){
        return Integer.valueOf(new DecimalFormat("0").format(
                (double) count_2 / this.size() * 100)
        ) + "%";
    }
}
