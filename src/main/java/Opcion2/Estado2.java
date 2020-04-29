package Opcion2;


public abstract class Estado2 {

    public abstract void jugar(Mascota2 mascota);

    public abstract void comer(Mascota2 mascota);

    public boolean puedoJugar(Mascota2 mascota){
        return  true;
    }

    public String getNombre(Estado2 estado){
        return estado.getClass().getSimpleName();
    }
}
