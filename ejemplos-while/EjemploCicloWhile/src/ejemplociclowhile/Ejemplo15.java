/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplociclowhile;

/**
 *
 * @author ASUS
 */
public class Ejemplo15 {
    public static void main(String[] args) {
        
        int contador = 1;
        int limite = 1;
        while(contador < limite){
            System.out.printf("valor %d\n", contador );
        }
    }
}
/*Este código nunca llega a ejecutarse dentro del bucle while porque la condición contador 
< limite evalúa como Falsa desde el primer instante.

