package Opcion1;

public class Hambrienta1 extends Estado1{

    public Hambrienta1(Mascota1 mascota) {
        super(mascota);
    }

    @Override
    public void jugar() {
    }

    @Override
    public void comer() {
        super.mascota.cambiarEstado(new Contenta1(this.mascota));
    }

    @Override
    public boolean puedoJugar() {
        return false;
    }
}
