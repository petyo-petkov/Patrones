package Comportamiento.State;

public class EstadoHacerFoto extends Estado{
    public EstadoHacerFoto(Telefono telefono) {
        super(telefono);
    }
    @Override
    public String desbloquear() {
        return "ya desbloqueado";
    }
    @Override
    public String abrirCamara() {
        return "ya abierta";
    }
    @Override
    public String hacerFoto() {
        //telefono.cambiaEstado(new EstadoBloqueado(telefono));
        return "la foto se a hecho " ;
    }
}
