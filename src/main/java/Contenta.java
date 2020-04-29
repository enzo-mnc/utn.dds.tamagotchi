public class Contenta implements IEstado{

    private int vecesJugadas;

    public Contenta() {
        this.vecesJugadas = 0;
    }

    @Override
    public void jugar(Mascota mascota) {

        if(vecesJugadas <= 5) {
            vecesJugadas++;
            mascota.incrementarFelicidad(2);
        }
        else{
            mascota.setEstado(new Hambrienta());
        }
    }

    @Override
    public void comer(Mascota mascota) {
        mascota.incrementarFelicidad(1);
    }

    @Override
    public boolean puedoJugar(Mascota mascota) {
        return true;
    }

    @Override
    public String getNombre() {
        return this.getClass().getSimpleName();
    }
}
