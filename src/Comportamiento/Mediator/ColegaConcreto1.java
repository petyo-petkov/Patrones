package Comportamiento.Mediator;

public class ColegaConcreto1 extends Colega{

    @Override
    void recibe() {
        System.out.println("He recebido un mensaje, soy ColegaConcreto1");
    }

    @Override
    void envia() {
        System.out.println("Soy ColegaConcreto1, envio un mensaje");
        mediator.reenvia(this);

    }
}
