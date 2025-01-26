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
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del cliente");
        String nombres = entrada.nextLine();
        System.out.println("Ingrese la cedula del cliente");
        String cedula = entrada.nextLine();
        System.out.println("Ingrese 1 para calcular el Valor de la Luz o 2 para"
                + "calcular el Valor del Predio");
        int indice = entrada.nextInt();
        if(indice == 1){
            calcularValorLuz(nombres, cedula);
        }else{
            if(indice == 2){
                calcularPredio(nombres, cedula);
            }
        }
    }
    
    public static void calcularValorLuz(String a, String b){
        Scanner entrada = new Scanner(System.in);
        int valorTotal;
        System.out.println("Ingrese el valor del Kylobatio");
        int valorKylo = entrada.nextInt();
        System.out.println("Ingrese el numero del Kylobatio por mes");
        int numeroKylo = entrada.nextInt();
        valorTotal = valorKylo * numeroKylo;
        
        System.out.printf("Cliente %s con cedula %s debe cancelar el valor de $%d\n",
                a,
                b,
                valorTotal);
    }
    public static void calcularPredio(String a, String b){
        Scanner entrada = new Scanner(System.in);
        double valorPredio;
        System.out.println("Ingrese el valor del inmueble");
        int valorInmueble = entrada.nextInt();
        valorPredio = valorInmueble * 0.02;
        
        System.out.printf("Cliente %s con cedula %s tiene un bien inmueble"
                + " valorado en $%d y tiene que pagar de predio $%.2f\n",
                a,
                b,
                valorInmueble,
                valorPredio);
    }
    
}
