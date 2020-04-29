import java.util.Objects;

public class Mascota {

    private IEstado estado;
    private int gradoDeFelicidad;
    private int tiempoAburrimiento;
    private int vecesJugadas;

    public Mascota() {
        this.estado = new Contenta();
        this.gradoDeFelicidad = 0;
        this.tiempoAburrimiento = 0;
        this.vecesJugadas = 0;
    }

    public int getGradoDeFelicidad() {
        return gradoDeFelicidad;
    }

    public int getTiempoAburrimiento(){
        return tiempoAburrimiento;
    }

    public void setEstado(IEstado estado) {
        this.estado = estado;
    }

    public void setGradoDeFelicidad(int gradoDeFelicidad) {
        this.gradoDeFelicidad = gradoDeFelicidad;
    }

    public void jugar(){
        if(vecesJugadas <= 5) {
            try {
                vecesJugadas++;
                estado.jugar(this);
            }
            catch (AccionInvalidaException e){
                System.out.println("La mascota no puede jugar");
            }
        }
        else{
            estado = new Hambrienta();
        }
    }

    public void comer(){
        estado.comer(this);
    }

    public boolean puedoJugar(){
        return !estado.equals(new Hambrienta());
    }

}
