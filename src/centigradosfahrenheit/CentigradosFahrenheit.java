/*
Ejercicio 1:
Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit. 
F = 32 + ( 9 * C / 5)
*/
package centigradosfahrenheit;

import java.util.Scanner;

/**
 *
 * @author Carlos Jose Anguiano 
 *         c.joseanguiano@gmail.com
 *         
 */
public class CentigradosFahrenheit {

    public static void main(String[] args) {

        double F = 0;       //El valor de F es 0
        int numero32 = 32;  //El valor de numero32 es 32 ya que este valor no cambia (de acuerdo a la formula)
        double centigrados; //Variable que guarda los grados centigrados proporcionados por el usuario.
        int nueve = 9;      //El valor de nueve es 9 ya que este valor no cambia (de acuerdo a la formula)    
        int cinco = 5;      //El valor de cinco es 5 ya que este valor no cambia (de acuerdo a la formula)    

        /*Declaramos una variable llamada "entrada"
        la variable "entrada" es un objeto de la clase Scanner      
         */
        Scanner entrada = new Scanner(System.in);

        /*Pedimos al usuario que ingrese los grados centigrados*/
        System.out.println("Ingresa los grados centigrados");
        //La variable centigrados obtiene los datos 
        centigrados = entrada.nextDouble();

        //La variable "F" obtendra los resultados de acuerdo a la formula
        F = numero32 + (nueve * centigrados / cinco);
        //Se imprime por pantalla el valor de "F"
        System.out.println("Los grados centigrados convertidos a Fahrenheit " + F);

    }

}
