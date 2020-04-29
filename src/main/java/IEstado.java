public interface IEstado {

    void jugar(Mascota mascota) throws AccionInvalidaException;
    void comer(Mascota mascota);
}
