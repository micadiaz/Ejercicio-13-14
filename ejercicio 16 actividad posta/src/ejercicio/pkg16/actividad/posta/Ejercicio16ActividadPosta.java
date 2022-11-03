package ejercicio.pkg16.actividad.posta;

import java.util.Scanner;

public class Ejercicio16ActividadPosta {

    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
        System.out.println("ingrese el tamaño del vector");
        int n=leer.nextInt();
        int [] vector=new int[n];
        rellena(vector,n);
        busca(vector,n); }

    public static int[] rellena(int[]vector,int n){
        for (int i = 0; i < n-1; i++) {
            vector[i]=(int)(Math.random()*20);}
        System.out.println("");

        for (int i = 0; i <= n-1; i++) {
            System.out.println(vector[i]);}   
        return vector;}
    
    public static void busca(int[]vector,int n){
        Scanner leer=new Scanner(System.in);
        System.out.println("");
        System.out.println("que numero queres buscar?");
        int num=leer.nextInt();
        int contador=0;
        for (int i = 0; i <= n-1; i++) {
            if (vector[i]==num){
                System.out.println("");
                System.out.println("el numero "+num+" esta en la posicion "+ i);}
            }             
        }
}
/*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido*/