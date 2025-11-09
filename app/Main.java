package app;

import Model.Cargo;
import Model.Rut;
import Model.Trabajadores;

/**
 * Clase principal donde se muestra la consola al usuario y puede ver los datos ingresados de cada trabajador
 * Se crean los datos a mostrar solicitados en clases anteriores y se muestra la información en la consola, es este caso solo los datos del cargo de los trabajadores.
 */


public class Main {

    public static void main(String[] args) {

        //SE CREAN LOS RUT DE LOS TRABAJADORES.
        Rut rut_00 = new Rut("9533156-9");
        Rut rut_01 = new Rut("18665335-K");
        Rut rut_02 = new Rut("20332466-0");
        Rut rut_03 = new Rut("11456233-6");

        //SE CREAN LOS TRABAJADORES

        Trabajadores ingresoTrabajador_00 = new Trabajadores(rut_00,"Alejandro Andrés","Ronald Salazar","955633556","alejandro.ronaldsalazar@salmontt.cl");
        Trabajadores ingresoTrabajador_01 = new Trabajadores(rut_01,"Javiera Ignacia","Cabrera Constanzo","969823664","javiera.cabreraconstanzo@salmontt.cl");
        Trabajadores ingresoTrabajador_02 = new Trabajadores(rut_02,"Ruben Moises","Gonzalez Huaquipan","999632268","ruben.gonzalezhuaquipan@salmontt.cl");
        Trabajadores ingresoTrabajador_03 = new Trabajadores(rut_03,"Rosa Marlene","Armijo Salvo","965894234","rosa.armijosalvo@salmontt.cl");

        //SE CREA EL CARGO PARA CADA TRABAJADOR

        Cargo cargoTrabajador_00 = new Cargo(rut_00,"Alejandro Andrés","Ronald Salazar","955633556","alejandro.ronaldsalazar@salmontt.cl","Gerente de Proyecto ",2400000);
        Cargo cargoTrabajador_01 = new Cargo(rut_01,"Javiera Ignacia","Cabrera Constanzo","969823664","javiera.cabreraconstanzo@salmontt.cl","Programador Encargado",1200000);
        Cargo cargoTrabajador_02 = new Cargo(rut_02,"Ruben Moises","Gonzalez Huaquipan","999632268","ruben.gonzalezhuaquipan@salmontt.cl","Practicante",700000);
        Cargo cargoTrabajador_03 = new Cargo(rut_03,"Rosa Marlene","Armijo Salvo","965894234","rosa.armijosalvo@salmontt.cl","Administradora Ventas",1500000);


        //MOSTRAR LA INFO EN CONSOLA.

        System.out.println(cargoTrabajador_00.toString());
        System.out.println();

        System.out.println(cargoTrabajador_03.toString());
        System.out.println();

        System.out.println(cargoTrabajador_01.toString());
        System.out.println();

        System.out.println(cargoTrabajador_02.toString());
        System.out.println();

    }
}