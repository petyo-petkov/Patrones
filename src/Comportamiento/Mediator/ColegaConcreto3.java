package Comportamiento.Mediator;

public class ColegaConcreto3 extends Colega{

    @Override
    void envia() {
        System.out.println("Soy el ColegaConcreto3, envio un mensaje");
        mediator.reenvia(this);
    }

    @Override
    void recibe() {
        System.out.println("He recibido un mensaje, soy el ColegaConcreto3");

    }
}
