package Opcion1;

public class Contenta1 extends Estado1{

    private int vecesJugadas;

    public Contenta1(Mascota1 mascota){
        super(mascota);
        this.vecesJugadas = 0;
    }

    @Override
    public void jugar() {
        this.vecesJugadas ++;
        this.mascota.incrementarFelicidad(2);

        if(vecesJugadas == 5){ super.mascota.cambiarEstado(new Hambrienta1(this.mascota));}
    }

    @Override
    public void comer() {
        this.mascota.incrementarFelicidad(1);
    }

}
