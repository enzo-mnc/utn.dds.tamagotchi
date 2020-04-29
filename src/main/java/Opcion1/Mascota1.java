package Opcion1;


public class Mascota1 {

    private Estado1 estado;
    private int gradoDeFelicidad;

    public Mascota1() {
        this.estado = new Contenta1();
        this.gradoDeFelicidad = 0;
    }

    public String getCondicion(){
        return String.format("Estado: %s \nGrado de felicidad: %d",this.estado.getNombre(),this.getGradoDeFelicidad());
    }

    public int getGradoDeFelicidad() {
        return gradoDeFelicidad;
    }

    public void cambiarEstado(Estado1 estado) {
        this.estado = estado;
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
}
