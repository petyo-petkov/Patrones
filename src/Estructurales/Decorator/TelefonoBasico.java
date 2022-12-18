package Estructurales.Decorator;

public class TelefonoBasico implements Telefono{
    @Override
    public void crear() {
        System.out.println("Soy un teléfono básico. Tengo estas caracteristicas: ");
        tengoGSM();
        tengoSMS();
    }


    private void tengoGSM() {
        System.out.println("    -> basico: tengo GSM");
    }


    private void tengoSMS() {
        System.out.println("    -> basico: tengo SMS");
    }
}
