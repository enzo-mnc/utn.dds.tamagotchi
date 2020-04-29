package Opcion3;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Aburrida implements IEstado{

    private Date inicioAburrimiento;

    public Aburrida() {
        this.inicioAburrimiento = new java.util.Date();
    }

    @Override
    public void jugar(Mascota mascota) {
        mascota.setEstado(new Contenta());
    }

    @Override
    public void comer(Mascota mascota) {
        if(this.estaAburridaHaceMasDe80Min()){
            mascota.setEstado(new Contenta());
        }
    }

    @Override
    public boolean puedoJugar(Mascota mascota) {
        return true;
    }

    private Boolean estaAburridaHaceMasDe80Min() {
        final long tiempoTrnascurrido = (new Date()).getTime() - inicioAburrimiento.getTime();
        final long minutosTranscurrido = TimeUnit.MILLISECONDS.convert(tiempoTrnascurrido, TimeUnit.MINUTES);

        return minutosTranscurrido > 80;
    }

    @Override
    public String getNombre() {
        return this.getClass().getSimpleName();
    }
}
