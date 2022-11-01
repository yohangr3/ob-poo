package poo.herencia;

import poo.clases.Motor;
import poo.clases.vehiculo;

public class Motocicleta extends vehiculo {

    boolean baul;

    public Motocicleta(){

    }

    public Motocicleta(Motor motor, String fabricante, String modelo, double cc, int year, boolean sport, boolean baul) {
        super(motor, fabricante, modelo, cc, year, sport);
        this.baul = baul;
    }


}
