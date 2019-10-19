package Ejercicio01;
import java.util.Random;
import java.util.Scanner;
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //declaramos un arreglo a entero
        int lista_numeros[],nuevo_valor;
        //instanciamos el arreglo de enteros
        lista_numeros = new int[100];
        /*Haciendo el llamado a la clase random para generar números aleatorios
        creando un objeto con el nombre aleatorio*/
        Random aleatorio = new Random(); 
        //Utilizo el bucle for para generan 100 numeros
        for(int i=0;i<100;i++){
            /*Creo un entero numero y le asigno un valor entero eleatorio 
            usando el objeto creado con el nombre aleatorio*/
            int numero = aleatorio.nextInt(21);//Pongo 21 para generar del 0 al 20
            //inicializamos el arreglo(agregamos elementos)
            lista_numeros[i]= numero;                             
        }
        System.out.println("La lista es:");
        for(int i=0;i<100;i++){
        //leemos los valores de cada elemento 
        System.out.print(lista_numeros[i]+" ");
        }
        System.out.println("");
        System.out.println("Ingrese numero a la lista: ");
        nuevo_valor= entrada.nextInt();
        //damos nueva valor al arreglo
        lista_numeros[0]=nuevo_valor;
        System.out.println("Ingrese numero a lista: ");
        nuevo_valor= entrada.nextInt();
        lista_numeros[1]=nuevo_valor;
        System.out.println("La nueva lista es: ");
        //Insertamos comillas a los nuevos numeros insertados
        System.out.print("\""+lista_numeros[0]+"\""+" ");
        System.out.print("\""+lista_numeros[1]+"\""+" ");
        for(int j=2;j<100;j++){
        //leemos los valores de cada elemento 
        System.out.print(+lista_numeros[j]+" ");} 
        }
}
