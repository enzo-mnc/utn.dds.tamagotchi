package Opcion2;


public class Contenta2 extends Estado2{

    private int vecesJugada;

    public Contenta2() {
        this.vecesJugada = 0;
    }

    @Override
    public void jugar(Mascota2 mascota) {
        mascota.incrementarFelicidad(2);
        this.vecesJugada ++;
        if(this.vecesJugada == 5){mascota.cambiarEstado(new Hambrienta2());}
    }

    @Override
    public void comer(Mascota2 mascota) {
        mascota.incrementarFelicidad(1);
    }
}
