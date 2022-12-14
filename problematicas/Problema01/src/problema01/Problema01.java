/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
       
        String nombreJugador;
        String posicionJugador;
        int edadJugador;
        double estaturaJugador;
        String serie = " ";
        String listaEdades = " ";
        double promedioEdades = 0;
        double promedioEstaturas = 0;

        for (int contador = 1; contador <= 5; contador++) {
            System.out.println("Ingrese el nombre del jugador por favor");
            nombreJugador = entrada.nextLine();
            System.out.println("Ingrese la posición del jugador por favor");
            posicionJugador = entrada.nextLine();
            System.out.println("Ingrese la edad del jugador por favor");
            edadJugador = entrada.nextInt();
            System.out.println("Ingrese la estatura del jugador por favor");
            estaturaJugador = entrada.nextDouble();
            
            entrada.nextLine();

            serie = String.format("%s%d%s-%s-,edad %d,estatura %.2f\n",
                    serie, contador,nombreJugador, posicionJugador,
                    edadJugador, estaturaJugador);

            promedioEdades = promedioEdades + edadJugador / contador;
            promedioEstaturas = promedioEstaturas + estaturaJugador / contador;
            
            listaEdades = String.format("%s %d", listaEdades
                    , edadJugador);
        }
        System.out.printf("Listado de Jugadores\n%sListado de Edades %s"
                + "Promedio edades %.2f\n"
                + "Promedio estaturas %.2f", serie, listaEdades, 
                promedioEdades,promedioEstaturas);
    }
    
}
