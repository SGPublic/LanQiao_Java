public class Main {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++){
            if (!judge(String.valueOf(i).split(""), i)){
                continue;
            }
            System.out.println(i);
        }
    }

    private static boolean judge(String[] s, int target){
        int add = 0;
        for (String index : s){
            Integer i = Integer.parseInt(index);
            add += i * i * i;
        }
        return add == target;
    }
}
