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
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int indice;
        System.out.println("Ingrese la opcion segun corresponda, AreaCuadrado(1),"
                + "AreaTriangulo(2) o AreaRectangulo(3)");
        indice = entrada.nextInt();
        if(indice == 1){
            obtenerAreaCuadrado();
        }else{
            if(indice == 2){
                obtenerAreaTriangulo();
            }else{
                if(indice == 3){
                    obtenerAreaRectangulo();
                }
            }
        }
        
    }
    public static void obtenerAreaCuadrado(){
        Scanner entrada = new Scanner(System.in);
        int lado;
        int area;
        System.out.println("Ingrese el lado del cuadrado");
        lado = entrada.nextInt();
        area = lado * lado;
        
        System.out.printf("El area del cuadrado es: %d\n", area);
        
    }
    public static void obtenerAreaTriangulo(){
        Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        double area;
        System.out.println("Ingrese la base del trinagulo");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura del trinagulo");
        altura = entrada.nextDouble();
        area = (base * altura)/2;
        
        System.out.printf("El area del triangulo es: %.2f\n", area);
    }
    public static void obtenerAreaRectangulo(){
        Scanner entrada = new Scanner(System.in);
        int base;
        int altura;
        int area;
        System.out.println("Ingrese la base del rectangulo");
        base = entrada.nextInt();
        System.out.println("Ingrese la altura del rectangulo");
        altura = entrada.nextInt();
        area = (base * altura);
        
        System.out.printf("El area del rectangulo es: %d\n", area);
    }
    
}
