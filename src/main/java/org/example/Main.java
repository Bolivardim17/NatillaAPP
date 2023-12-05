package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Entradas del problema
        String nombreUsuario="Bolillo";
        short edadUsuario=34;
        String telefonoUsuario="3007066167";
        String documentoIdentidad="1017254493";
        int cuotaEnero;
        int cuotaFebrero;
        int cuotaMarzo;
        int cuotaAbril;
        int cuotaMayo;
        int cuotaJunio;
        int cuotaJulio;
        int cuotaAgosto;
        int cuotaSeptiembre;
        int cuotaOctubre;
        int cuotaNoviembre;
        String direccionUsuario="cra 27 45a 103";
        double costoInscrepcion=150000.0;
        float tasaInteresNatillera=0.1f;
        double saldoFinalUsuarios;

        //PROCESO

        //1. Asignar un valor especifico a una variable
        // desde el TECLADO (recibir datos)

        Scanner leerDato = new Scanner(System.in);

        System.out.println(" cual es tu nombre?");
        nombreUsuario=leerDato.nextLine();
        System.out.println("Bienvenido "+nombreUsuario);

        System.out.println("cual es tu documento identidad");
        documentoIdentidad=leerDato.nextLine();
        System.out.println("Tu Identificacion es "+documentoIdentidad);

        System.out.println(" cual es tu numero de telefono");
        telefonoUsuario=leerDato.nextLine();
        System.out.println("tu telefono es"+telefonoUsuario);








    }
}