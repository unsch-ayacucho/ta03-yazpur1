
package Ejercicio02;
import java.util.Scanner;
public class Ejericio02 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int[] num = new int[10];
        int[] resultado = new int[10];
        int contador = 0;
        int cuentaArray = 0;
        int prim = 0;
        int prueba = 0;

        System.out.println("Introduzca 10 números: ");
        //primero pedimos los números por teclado
        for (int i = 0; i < 10; i++) {
          num[i] = entrada.nextInt();
        }

        System.out.println("Índice\tValor");
        //mostramos el array
        for (int i = 0; i < 10; i++) {
          System.out.println(i + "\t" + num[i]);
        }

        //comprobamos cuales son primos y los posicionamos primero
        for (int i = 0; i < 10; i++) {
          do {
            prim++;
            prueba = num[i] % prim;

            if (prueba == 0) {
              contador++;
            } else {
              //nada
            }
          } while (prim != num[i]); 

            if (contador == 2) {
              resultado[cuentaArray] = num[i];
              cuentaArray++;
            } else {
            //nada
            }

          contador = 0;
          prim = 0;
        }//for

        //ahora metemos en el array resultante los que quedan
        for (int i = 0; i < 10; i++) {
          do {
            prim++;
            prueba = num[i] % prim;

            if (prueba == 0) {
              contador++;
            } else {
              //nada
            }
          } while (prim != num[i]);  

            if (contador != 2) {
            resultado[cuentaArray] = num[i];
            cuentaArray++;
            } else {
            //nada
            }

          contador = 0;
          prim = 0;
        }//for

        System.out.println("\nArray final");
        //por último mostramos el array resultante
        System.out.println("Índice\tValor");
        //mostramos el array
        for (int i = 0; i < 10; i++) {
          System.out.println(i + "\t" + resultado[i]);
        }
      }
    }

