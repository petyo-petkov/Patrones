package Creacionales.Factory;

public class Main {
    public static void main(String[] args) {

        PrecioFactory precio = new PrecioFactory("españa");
        System.out.println(precio.getPrecio());

        PrecioFactory precio2 = new PrecioFactory("otro");
        System.out.println(precio2.getPrecio());

        PrecioFactory precio3 = new PrecioFactory("UK");
        System.out.println(precio3.getPrecio());

    }
}
