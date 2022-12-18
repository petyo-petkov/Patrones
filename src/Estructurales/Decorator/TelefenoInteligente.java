package Estructurales.Decorator;

public class TelefenoInteligente extends TelefonoDecorator {
        public TelefenoInteligente(Telefono telefono) {
            super(telefono);
        }

    @Override
    public void crear() {
        super.crear();
        System.out.println("    -> inteligente: tengo tambien 4G");
    }
}
