package Comportamiento.Observer;

public class Main {
    public static void main(String[] args) {

        Emisora emisora = new Emisora();

        ReceptorTV tv = new ReceptorTV();
        ReceptorRadio radio = new ReceptorRadio();

        emisora.meteReceptor(tv);
        emisora.meteReceptor(radio);

        emisora.emite();

    }
}
