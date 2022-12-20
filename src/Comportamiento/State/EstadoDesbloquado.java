package Comportamiento.State;

public class EstadoDesbloquado extends Estado{
    public EstadoDesbloquado(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "debloquear(), El móvil ya estaba desbloqueado";
    }

    @Override
    public String abrirCamara() {
        telefono.cambiaEstado(new EstadoCamaraAbierta(telefono));
        return "abrirCamara(), Camara abierta";
    }

    @Override
    public String hacerFoto() {
        return "hacerFoto(), No se puede hacer una foto sin abrir la cámara";
    }
}
