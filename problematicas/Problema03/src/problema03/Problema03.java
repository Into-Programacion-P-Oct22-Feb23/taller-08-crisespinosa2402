/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author USUARIO
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String serie = "";
        int limite = 84;
        double primerNumero = 5;
        double operacion;
        double segundoNumero = 9;
        int variable = 32;

        for (double contador = 20; contador < limite; contador += 4) {
            operacion = (primerNumero / segundoNumero) * (contador - variable);
            serie = String.format("%s %.0f °F = %.2f °C\n",
                    serie, contador, operacion);

        }
        System.out.println(serie);
    }

}
