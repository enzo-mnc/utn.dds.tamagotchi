public interface IEstado {

    void jugar(Mascota mascota);
    void comer(Mascota mascota);
    boolean puedoJugar(Mascota mascota);
    String getNombre();
}
