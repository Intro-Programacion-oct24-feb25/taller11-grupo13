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
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);  
        System.out.println("Ingrese la primera nota del estudiante: ");
        double nota1 = entrada.nextDouble();
        System.out.println("Ingrese la segunda nota del estudiante: ");
        double nota2 = entrada.nextDouble();
        System.out.println("Ingrese la tercera nota del estudiante: ");
        double nota3 = entrada.nextDouble();
        System.out.println("Ingrese la cuarta nota del estudiante: ");
        double nota4 = entrada.nextDouble();
        
        String mensaje = obtenerPromedioCualitativo(nota1, nota2, nota3, nota4);
        mensaje = "El promedio de las notas: "+nota1+ ", " +nota2+", "+nota3+
                ", "+ nota4 +" es "+ mensaje;
        String mensaje2 = obtenerMayusculas(mensaje);
        System.out.printf("%s\n", mensaje2);
    
    }
    public static String obtenerPromedioCualitativo(double a, double b, double c, double d){
        String mensaje = "";
        double promedio;
        double suma;
        suma = a + b + c + d;
        promedio = suma/4;
        if ((promedio >= 0) && (promedio <= 5)) {
            mensaje = "Regular";
        } else {
            if ((promedio >= 5.1) && (promedio <= 8)) {
                mensaje = "Bueno";
            } else {
                if ((promedio >= 8.1) && (promedio <= 9)) {
                    mensaje = "Muy bueno";
                } else {
                    if ((promedio >= 9.1) && (promedio <= 10)) {
                        mensaje = "Sobresaliente";
                    }
                }
            }
        }
        return mensaje;
    }
    public static String obtenerMayusculas(String a){
        String mayuscula = "";
        mayuscula = a.toUpperCase();
        
        return mayuscula;
    }
    
}
