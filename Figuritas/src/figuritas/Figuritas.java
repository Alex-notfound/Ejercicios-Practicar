package figuritas;

public class Figuritas {

    public static void main(String[] args) {
        crearArbolNavidad(12);
        ArbolNavidadNumeros(12);
        dobleTriangulo(7);
        flecha(4);
//        rombo(10); METODO NO ACABADO
    }

    public static void dobleTriangulo(int filas) {
        for (int i = 1; i <= filas; i++) {
            System.out.println("");
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int spaces = 0; spaces < filas - i; spaces++) {
                System.out.print(" ");
            }
            for (int spaces = 0; spaces < filas - i - 1; spaces++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i && j < filas - 1; j++) {
                System.out.print("*");
            }
        }
    }

    public static void flecha(int filas) {
        for (int i = 1; i <= filas; i++) {
            System.out.println("");
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int spaces = 0; spaces < filas - i; spaces++) {
                System.out.print(" ");
            }
            for (int spaces = 0; spaces < filas - i - 1; spaces++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i && j < filas - 1; j++) {
                System.out.print("*");
            }
        }
        for (int i = 1; i <= filas; i++) {
            System.out.println("");
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int spaces = 0; spaces < filas - i; spaces++) {
                System.out.print("*");
            }
            for (int spaces = 0; spaces < filas - i - 1; spaces++) {
                System.out.print("*");
            }
            for (int j = 0; j < i && j < filas - 1; j++) {
                System.out.print(" ");
            }
        }
    }

    public static void rombo(int filas) {
        for (int i = 1; i <= filas; i++) {
            for (int spaces = 0; spaces < filas - i - 1; spaces++) {
                System.out.print("*");
            }
            for (int j = 0; j < i && j < filas - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int spaces = 0; spaces < filas - i; spaces++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 1; i <= filas; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int spaces = 0; spaces < filas - i; spaces++) {
                System.out.print(" ");
            }
            for (int spaces = 0; spaces < filas - i - 1; spaces++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i && j < filas - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    public static void crearArbolNavidad(int filas) {
        int cont;
        int aux = 1;
        for (int i = 0; i < filas; i++) {
            cont = aux;
            for (int espacios = 0; espacios < filas - i; espacios++) {
                System.out.print(" ");
            }
            while (cont > 0) {
                System.out.print("*");
                cont--;
            }
            if (i > 0) {
                aux += 2;
                System.out.print("**");
            }
            System.out.println("");
        }

    }

    public static void ArbolNavidadNumeros(int filas) {
        int cont = 1;
        for (int i = 0; i < filas; i++) {
            for (int espacios = 0; espacios < filas - i; espacios++) {
                System.out.print(" ");
            }
            if (i == 0) {
                System.out.print(cont);
            } else {
                cont++;
                for (int j = cont; j > 1; j--) {
                    if (j > 9) {
                        System.out.print(j - 10);
                    } else {
                        System.out.print(j);
                    }
                }
                System.out.print(1);
                for (int j = 2; j <= cont; j++) {
                    if (j > 9) {
                        System.out.print(j - 10);
                    } else {
                        System.out.print(j);
                    }
                }
            }
            System.out.println("");
        }
    }
}
