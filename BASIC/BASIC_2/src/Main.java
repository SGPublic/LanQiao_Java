import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        for (int index = 0; index < 2 * 2 * 2 * 2 * 2; index++){
            println(new BigInteger(String.valueOf(index), 10).toString(2));
        }
    }

    private static void println(String out){
        switch (out.length()){
            case 1:
                out = "0" + out;
            case 2:
                out = "0" + out;
            case 3:
                out = "0" + out;
            case 4:
                out = "0" + out;
        }
        System.out.println(out);
    }
}
