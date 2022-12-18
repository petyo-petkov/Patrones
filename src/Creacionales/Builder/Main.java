package Creacionales.Builder;

public class Main {
    public static void main(String[] args) {
        //Vehiculo vehiculo = new Vehiculo();
        Vehiculo coche = new CocheBuilder("Honda")
                .setMotor("electrico")
                .setPuertas(3)
                .build();

        System.out.println("Marca " + coche.getMarca());
        System.out.println("Motor " + coche.getMotor());
        System.out.println("Puertas " + coche.getPuertas());
    }
}
