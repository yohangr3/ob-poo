package poo.clases;

public class Main {
    public static void main(String[] args) {

        //Sintaxis creación de un objeto
        //Clase identificador  = new Clase();

        //Creamos un objeto utilizando el constructor vacio

        vehiculo toyota = new vehiculo();

        //Creamos un objeto utilizando el constructor con parametros

        vehiculo ford = new vehiculo("ford","Mondeo" , 2.1,2010,false);
        System.out.println(ford.fabricante);
        System.out.println(ford.year);
        System.out.println(ford.speed);
        ford.acelerar(50); //utilizamos el método acelerar para aumentar veloidad a 50km/h
        System.out.println(ford.speed);

    }
}
