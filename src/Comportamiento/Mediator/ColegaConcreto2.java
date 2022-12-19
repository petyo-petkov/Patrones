package Comportamiento.Mediator;

public class ColegaConcreto2 extends Colega{

    @Override
    void recibe() {
        System.out.println("He recibido in mensaje, soy el ColegaConcreto2 ");
    }

    @Override
    void envia() {
        System.out.println("Soy el ColegaConcreto2, envio un mensaje ");
        mediator.reenvia(this);
    }
}
