package poo.abstracta;

public class Main {
    public static void main(String[] args) {

        /*
        No podemos instanciarla ni crear objetos de esta clase ya que es abstracta

        SerVivo servivo = new SerVivo();
         */


        Planta planta = new Planta();
        planta.alimentarse();

        Animal animal = new Animal();
        animal.alimentarse();

        AnimalHerbiboro animalHerbiboro = new AnimalHerbiboro();
        animalHerbiboro.alimentarse();


    }
}
