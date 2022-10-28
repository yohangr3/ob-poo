package poo.encapsulamiento;

public class clase2 {
    public static void main(String[] args) {

        clase1 objeto1 = new clase1();
        clase1 objeto2 = new clase1();

        objeto1.setEdad(10);
        objeto2.setNombre("Yohan");
        System.out.println("La edad es : " + objeto1.getEdad());
        System.out.println("El nombres es : " + objeto2.getNombre());
    }

}
