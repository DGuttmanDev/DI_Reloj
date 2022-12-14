package es.di.model;

import java.io.Serializable;
import java.util.Date;

public class Alarma implements Serializable{
    
    private Date horaAlarma;
    private boolean activa;
    private boolean sonando;

    public Alarma(Date horaAlarma, boolean activa) {
        this.horaAlarma = horaAlarma;
        this.activa = activa;
        this.sonando = false;
    }

    public Date getHoraAlarma() {
        return horaAlarma;
    }

    public void setHoraAlarma(Date horaAlarma) {
        this.horaAlarma = horaAlarma;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public boolean isSonando() {
        return sonando;
    }

    public void setSonando(boolean sonando) {
        this.sonando = sonando;
    }
    
    
    
}
