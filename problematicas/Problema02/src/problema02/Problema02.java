/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

/**
 *
 * @author USUARIO
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] operacion = {1, 2, 3, 4};
        
        System.out.println("N°" + "\t" + "x2" + "\t" + "x3" + "\t" + "x4");
        
        for (int contador = 25; contador > 0; contador--) {

            System.out.println(contador * operacion[0] + "\t" + contador
                    * operacion[1] + "\t" + contador * operacion[2]
                    + "\t" + contador * operacion[3] + "\t");

        }
    }
    
}
