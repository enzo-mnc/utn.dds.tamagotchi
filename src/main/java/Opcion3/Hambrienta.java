package Opcion3;

public class Hambrienta implements IEstado{

    @Override
    public void jugar(Mascota mascota){
    }

    @Override
    public void comer(Mascota mascota) {
        mascota.setEstado(new Contenta());
    }

    @Override
    public boolean puedoJugar(Mascota mascota) {
        return false;
    }

    @Override
    public String getNombre() {
        return this.getClass().getSimpleName();
    }
}
