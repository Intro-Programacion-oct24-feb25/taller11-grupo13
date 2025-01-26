/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Problema7 {
    public static void main(String[] args) {
        String [] arreglo = obtenerCadena();
        
        obtenerCaracteres(arreglo);
        
        
    }
    
    public static String [] obtenerCadena(){
        Scanner entrada = new Scanner(System.in);
        int indice;
        System.out.println("Ingrese el numero de elementos del arreglo");
        indice = entrada.nextInt();
        entrada.nextLine();
        String [] arreglo = new String [indice];
        for(int i = 0; i < arreglo.length; i++){
            System.out.println("Ingrese "+indice+" ciudades del Ecuador");
            arreglo[i] = entrada.nextLine();
        }
        
        
        return arreglo; 
    }
    public static void obtenerCaracteres(String[] a){
        System.out.println("\nCiudades con 4 o 5 caracteres:");
        for(int i = 0; i < a.length; i++){
            if(a[i].length() == 4 || a[i].length() == 5){
                System.out.printf("%s\n", a[i]);
            }
        }
        
    }
    
    
}
