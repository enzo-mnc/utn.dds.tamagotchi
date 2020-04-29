package Opcion2;


public class Aburrida2 extends Estado2 {

    private int minutosAburrimiento;

    public Aburrida2(int minutosAburrimiento) {
        this.minutosAburrimiento = minutosAburrimiento;
    }

    @Override
    public void jugar(Mascota2 mascota) {
        mascota.cambiarEstado(new Contenta2());
    }

    @Override
    public void comer(Mascota2 mascota) {
        if(this.estaAburridaHaceMasDe80Min()){
            mascota.cambiarEstado(new Contenta2());
        }
    }

    private Boolean estaAburridaHaceMasDe80Min() {
        return minutosAburrimiento > 80;
    }
}
