import java.util.Objects;

public class Mascota {

    private IEstado estado;
    private int gradoDeFelicidad;

    public Mascota() {
        this.estado = new Contenta();
        this.gradoDeFelicidad = 0;
    }

    public String getCondicion(){
        return String.format("Estado: %s \nGrado de felicidad: %d",this.estado.getNombre(),this.getGradoDeFelicidad());
    }

    public int getGradoDeFelicidad() {
        return gradoDeFelicidad;
    }

    public void setEstado(IEstado estado) {
        this.estado = estado;
    }

    public void incrementarFelicidad(int gradoDeFelicidad) {
        this.gradoDeFelicidad += gradoDeFelicidad;
    }

    public void jugar(){
            try {
                this.estado.jugar(this);
            }
            catch (AccionInvalidaException e) {
                System.out.println("La mascota no puede jugar");
            }
    }

    public void comer(){
        estado.comer(this);
    }

    public boolean puedoJugar(){
        return estado.puedoJugar(this);
    }

}
