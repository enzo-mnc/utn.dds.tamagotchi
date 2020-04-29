package Opcion2;

public class Hambrienta2 extends Estado2 {

    @Override
    public void jugar(Mascota2 mascota) {}

    @Override
    public void comer(Mascota2 mascota) {
        mascota.cambiarEstado(new Contenta2());
    }

    @Override
    public boolean puedoJugar(Mascota2 mascota) {
        return false;
    }
}
