package Opcion1;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Aburrida1 extends Estado1{

    private Date inicioAburrimiento;

    public Aburrida1(Mascota1 mascota) {
        super(mascota);
        this.inicioAburrimiento = new Date();
    }

    @Override
    public void jugar() {
        super.mascota.cambiarEstado(new Contenta1(this.mascota));
    }

    @Override
    public void comer() {
        if(this.estaAburridaHaceMasDe80Min()){
            super.mascota.cambiarEstado(new Contenta1(this.mascota));
        }
    }

    private Boolean estaAburridaHaceMasDe80Min() {
        final long tiempoTrnascurrido = (new Date()).getTime() - inicioAburrimiento.getTime();
        final long minutosTranscurrido = TimeUnit.MILLISECONDS.convert(tiempoTrnascurrido, TimeUnit.MINUTES);

        return minutosTranscurrido > 80;
    }
}
