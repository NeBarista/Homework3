public class Main {
    public static void main(String[] args) {
        String a = new String("ABCD");
        String b = new String("EFGH");
        String c = new String(sum(a, b));
        print(c);
    }

    private static void print(String c) {
        System.out.println(c);
    }

    static String sum(String a, String b) {
        return a + b;
    }
}
