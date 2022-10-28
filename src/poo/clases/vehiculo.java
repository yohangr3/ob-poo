package poo.clases;

public class vehiculo {

    //atributos
    String fabricante;
    String modelo;
    double cc;
    int year;
    boolean sport;
    int speed;
    Motor motor;

    //constructores

    //Creación de un constructor y objeto vacio
    public vehiculo() {

    }

    //Creamos un objeto vehiculo con todos sus parametros
    public vehiculo(Motor motor ,String fabricante, String modelo, double cc, int year, boolean sport) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.speed = 0;
        this.motor = motor;
    }

    public vehiculo(String fabricante, int year) {
        this.fabricante = fabricante;
        this.year = year;
    }

    //Métodos - (Funcionalidad de un objeto)
    public void acelerar(int quantity){
        this.speed = speed + quantity;
    }



}
