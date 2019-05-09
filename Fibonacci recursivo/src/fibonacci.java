
public class fibonacci {

    public static void main(int numVeces) {
        int toret = fibo(0, 1, numVeces);
        System.out.println(toret);
    }

    public static int fibo(int a, int b, int veces) {
        if (veces-1 > 1) {
            return fibo(a + b, a, --veces);
        }
        return a + b;
    }
}