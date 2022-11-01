package poo.clases;


import poo.herencia.Motocicleta;

public class Main {
    public static void main(String[] args) {

        //Sintaxis creación de un objeto
        //Clase identificador  = new Clase();

        //Creamos un objeto utilizando el constructor vacio

        vehiculo toyota = new vehiculo();

        Motor motorGTI = new Motor("GTI" , 190,459,6);
        //Creamos un objeto utilizando el constructor con parametros

        vehiculo ford = new vehiculo(motorGTI,"ford","Mondeo" , 2.1,2010,false);
        System.out.println(ford.fabricante);
        System.out.println(ford.year);
        System.out.println(ford.speed);
        ford.acelerar(50); //utilizamos el método acelerar para aumentar veloidad a 50km/h
        System.out.println(ford.speed);

        Motocicleta kawasakiNinja = new Motocicleta();
        kawasakiNinja.fabricante = "Kawasaki";
        System.out.println(kawasakiNinja.fabricante);



        System.out.println("fin del programa");

        //Polimorfismo

        vehiculo Vehiculo;
        Vehiculo = new Motocicleta();
        Vehiculo.acelerar(100);
        System.out.println(Vehiculo.speed);


        //Clases abstractas , no se pueden instanciar

    }
}
