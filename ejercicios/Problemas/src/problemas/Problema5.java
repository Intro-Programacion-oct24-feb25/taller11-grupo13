/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema5 {
    
    
    public static void main(String[] args){
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int[][] informacion2 = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int[][] arreglo = new int [3][3];
        
        for(int i = 0; i < informacion.length; i++){
            for(int j = 0; j < informacion[i].length; j++){
                arreglo[i][j] = obtenerSuma(informacion[i][j],
                        informacion2[i][j]);
            }
        }
        obtenerReporte(arreglo);
    }
    public static int obtenerSuma(int a, int b){
        int suma;
        suma = a +b;
        return suma;
    }
    public static void obtenerReporte(int[][] suma){
        String mensaje = "";
        
        for(int i = 0; i < suma.length; i++){
            for(int j = 0; j < suma[i].length; j++){
                mensaje = String.format("%s%s\t", mensaje, suma[i][j]);
            }
            mensaje = String.format("%s\n", mensaje);
        }
        System.out.printf("%s\n", mensaje);
    }
    
    
    
}
