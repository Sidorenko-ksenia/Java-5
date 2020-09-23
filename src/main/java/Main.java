public class Main {
    public static void main(String[] args) {
        int s = 0;
        int p = 1;
        for (String arg : args) {
            int all = Integer.parseInt(arg);
            s = s + all;
            p = p * all;
        }
        System.out.println("Сумма = " +s);
        System.out.println("Произведение = " +p);
    }
}
