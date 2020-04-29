public class Hambrienta implements IEstado{

    @Override
    public void jugar(Mascota mascota) throws AccionInvalidaException {
        throw new AccionInvalidaException();
    }

    @Override
    public void comer(Mascota mascota) {
        mascota.setEstado(new Contenta());
    }
}
