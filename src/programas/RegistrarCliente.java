
package programas;

import java.util.Scanner;

/* @author Jaime Llanos Bardales */
public class RegistrarCliente {
    public static void main (String[] args){
        //Declaracion de variables
        String cliente;
        double compra, tc=0;
        //Creando el objeto leer datos
        Scanner lectura=new Scanner(System.in);
        //Entrada de Datos
        System.out.println("Nombre Cliente: ");
        cliente = lectura.nextLine();
        for (int i=0; i<3;i++){
            System.out.println("Compra "+(i+1)+" :");
            compra = lectura.nextDouble();
            tc+=compra;
        }
        //Salida de Datos
        System.out.println("Nombre de Cliente: "+cliente);
        System.out.println("Total Compra: "+tc);
        System.out.println("Promedio Compra: "+(tc/3));
    } //Fin del Metodo
} //Fin del Programa
