package Comportamiento.State;

public class EstadoCamaraAbierta extends Estado{
    public EstadoCamaraAbierta(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "desbloquear(), EL MÓVIL YA ESTABA DESBLOQUEADO!!!";
    }

    @Override
    public String abrirCamara()
    {
        return "abrirCamara(), LA CÁMARA YA ESTA ABIERTA!!!";
    }

    @Override
    public String hacerFoto() {
        telefono.cambiaEstado(new EstadoHacerFoto(telefono));
        return "hacerFoto(), Puedes hacer la foto";
    }
}
