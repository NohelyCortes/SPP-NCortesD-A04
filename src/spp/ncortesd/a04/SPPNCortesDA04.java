/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.ncortesd.a04;
import java.util.Scanner;
/**
 *
 * @author Nohely
 */
public class SPPNCortesDA04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int opEntrada;
        double angulo, resultado;
        Scanner kb = new Scanner (System.in);
        //Desplegar menú
        System.out.println("Calculadora de función trigonométricas");
        System.out.println("Introduzca la opción deseada");
        System.out.println("1. Cálculo de Tangente");
        System.out.println("2. Cálculo de Seno");
        System.out.println("3. Cálculo de Coseno");
        System.out.println("4. Salir");
        opEntrada = kb.nextInt();
        
        switch (opEntrada){
            case 1:
                System.out.println("Bienvenido al cálculo de Tangente");
                //Llamamos el método para solicitar datos
                //Lo que devuelve lo guardamos en la variable ángulo
                angulo= mensajePedirangulo();
                resultado= Math.tan(angulo);
                System.out.println("La tangente del ángulo es "+ resultado);
                break;
            case 2:
                System.out.println("Bienvenido al cálculo de Seno");
                angulo= mensajePedirangulo();
                resultado= Math.sin(angulo);
                System.out.println("El seno del ángulo es "+ resultado);
                break;
            case 3:
                System.out.println("Bienvenido al cálculo de Coseno");
                angulo= mensajePedirangulo();
                resultado= Math.cos(angulo);
                System.out.println("El coseno del ángulo es "+ resultado);
                break;
            default:
                System.out.println("Adiós");
                    
        }
    }
    static double mensajePedirangulo(){
        //Variables
        double angulo;
        Scanner kb= new Scanner (System.in);
        System.out.println("Introduce el ángulo entre 0°-360°");
        angulo=kb.nextDouble();
        return angulo;
    }
}
