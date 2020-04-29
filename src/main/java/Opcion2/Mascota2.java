package Opcion2;

public class Mascota2 {

    private Estado2 estado;
    private int gradoDeFelicidad;

    public Mascota2(Estado2 estado) {
        this.estado = new Contenta2();
        this.gradoDeFelicidad = 0;
    }

    public void cambiarEstado(Estado2 estado) {
        this.estado = estado;
    }

    public int getGradoDeFelicidad() {
        return gradoDeFelicidad;
    }

    public void incrementarFelicidad(int gradoDeFelicidad) {
        this.gradoDeFelicidad += gradoDeFelicidad;
    }

    public void jugar(){
        if(this.estado.puedoJugar(this)){
            this.estado.jugar(this);
        }
    }

    public void comer(){
        estado.comer(this);
    }

    public boolean puedoJugar(){
        return estado.puedoJugar(this);
    }

    public String getCondicion(){
        return String.format("Estado: %s \nGrado de felicidad: %d",this.estado.getNombre(this.estado),this.getGradoDeFelicidad());
    }
}
