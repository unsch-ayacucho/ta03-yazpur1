package Ejercicio03;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        //declarando varibles
        int i;
        //variables para convertir un string a int
        int dato1;
        String dato;
        //Creando lista
        ArrayList<String> numeros;
        numeros = new ArrayList();

        Random aleatorio = new Random();

        //llenar elementos del array
        for(i=0;i<500;i++){
        numeros.add(Integer.toString(aleatorio.nextInt(501)));
        }

        System.out.println(numeros);
        
        System.out.print("¿Que desea descartar? (Minimo-1 ; Maximo-2): ");
        dato = entrada.next();
        System.out.println("(Minimo-1 ; Maximo-2): "+dato);
        dato1 = Integer.parseInt(dato);//convirtiendo a entero
        int k = Integer.parseInt(numeros.get(0));

        //minimo o maximo

        //minimo
        if (dato1==1){
        for(i=0;i<500;i++){
        int j = Integer.parseInt(numeros.get(i));
        if(j<k){
        k = j;
        numeros.set(i,"*"+numeros.get(i)+"*");

        }
        }
        System.out.println(numeros);

        }
        //maximo
        else if(dato1==2){
        for(i=0;i<500;i++){
        int j= Integer.parseInt(numeros.get(i));
        if(j>k){
        k = j;
        numeros.set(i,"*"+numeros.get(i)+"*");
        }
        } 
        System.out.println(numeros);
        }
        //opcion invalida
        else{
        System.out.println("Ingrese opcion valida");
        }
            }
        }
