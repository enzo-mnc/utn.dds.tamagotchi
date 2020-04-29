public class Contenta implements IEstado{
    @Override
    public void jugar(Mascota mascota) {
        mascota.setGradoDeFelicidad(mascota.getGradoDeFelicidad() + 2);
    }

    @Override
    public void comer(Mascota mascota) {
        mascota.setGradoDeFelicidad(mascota.getGradoDeFelicidad() + 1);
    }

}
