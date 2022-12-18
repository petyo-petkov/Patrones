package Estructurales.Decorator;

public class TelefonoNextGen extends TelefonoDecorator {
    public TelefonoNextGen(Telefono telefono) {
        super(telefono);
    }

    @Override
    public void crear() {
        super.crear();
        System.out.println("    -> nextgen: tengo tambien 5G");
        System.out.println("    -> nextgen: tengo tambien VoLTE");
    }
}

