package Estructurales.Decorator;

public class Main {
    public static void main(String[] args) {
        //TelefonoBasico telefonoBasico = new TelefonoBasico();
        //telefonoBasico.crear();

        //TelefenoInteligente ti = new TelefenoInteligente(new TelefonoBasico());
        //ti.crear();

        TelefonoNextGen ng = new TelefonoNextGen(new TelefenoInteligente(new TelefonoBasico()));
        ng.crear();
    }
}
