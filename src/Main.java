import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas: ");
        int m = sc.nextInt();
        System.out.println(m);
        System.out.println("Ingrese el numero de columnas");
        int n = sc.nextInt();
        System.out.println(n);

        System.out.println(ValidarFilasYColumnas(m, n)); //Validacion
        MostrarFilas(HacerMatriz(m,n));
    }

    public static boolean ValidarFilasYColumnas(int m, int n) {
        if (m <= 0 || n <= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static int[][] HacerMatriz(int m, int n) {
        int[][] matriz = new int[m][n];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                Random rand = new Random();
                int indice = rand.nextInt(0, 10);
                matriz[i][j] = indice;
        }
            }


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println();
        }

        return matriz;
    }


    public static void MostrarFilas(int[][]matriz) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de la fila que quiere: ");
        int f = sc.nextInt();
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[0][i] + " ");

            }


        }
    }



