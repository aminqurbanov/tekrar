public class Main {
    public static void main(String[] args) {
       int a = 32, b = 32;
       int result1, result2;

       result1 = ++a;
        System.out.println(result1);

        result1 = a++;
        System.out.println(result1);

        result2 = ++a;
        System.out.println(result2);

        result2 = a++;
        System.out.println(result2);
    }
}