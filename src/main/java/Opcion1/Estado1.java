package Opcion1;

public abstract class Estado1 {

    protected Mascota1 mascota;

    public Estado1(Mascota1 mascota){
        this.mascota = mascota;
    }

    public abstract void jugar();

    public abstract void comer();

    public boolean puedoJugar(){
        return  true;
    }

    public String getNombre(Estado1 estado){
        return estado.getClass().getSimpleName();
    }
}
