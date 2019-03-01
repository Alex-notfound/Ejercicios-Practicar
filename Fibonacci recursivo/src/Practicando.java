
import java.util.Scanner;

public class Practicando {

    public static void main(String[] args) {
        int n;
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        n = leer.nextInt();
        System.out.println("La serie de Fibonacci de los primeros " + n + " numeros");
        fibonacci(n, 1, -1);
    }

    public static void fibonacci(int n, int x, int y) {
        int num = y + x;
        y = x;
        n--;
        System.out.println(num);
        if (n > 0) {
            fibonacci(n, num, y);
        }
    }
}
