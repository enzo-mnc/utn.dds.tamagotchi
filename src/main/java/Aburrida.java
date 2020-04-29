public class Aburrida implements IEstado{
    @Override
    public void jugar(Mascota mascota) {
        mascota.setEstado(new Contenta());
    }

    @Override
    public void comer(Mascota mascota) {
        if(mascota.getTiempoAburrimiento() > 80){
            mascota.setEstado(new Contenta());
        }
    }
}
