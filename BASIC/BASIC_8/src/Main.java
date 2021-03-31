public class Main {
    public static void main(String[] args) {
        for (long i = 1001; i <= 9999; i++){
            String[] s = String.valueOf(i).split("");
            if (!judge(s)){
                continue;
            }
            System.out.println(i);
        }
    }

    public static boolean judge(String[] args){
        int length = args.length - 1;
        for (int i = 0; i < length / 2 + 1; i++) {
            int start = Integer.parseInt(args[i]);
            int end = Integer.parseInt(args[length - i]);
            if (start != end){
                return false;
            }
        }
        return true;
    }
}
