/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.di.component;

import es.di.model.Alarma;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;

/**
 *
 * @author dguttman
 */
public class RelojLabel extends JLabel implements Serializable{
    
    private boolean activarSegundos;
    private Alarma alarma;
    
    private SimpleDateFormat horaSinSegundos = new SimpleDateFormat("HH:mm");
    private SimpleDateFormat horaConSegundos = new SimpleDateFormat("HH:mm:ss");

    public RelojLabel() {
        
        Timer timer = new Timer();
        timer.schedule(new TimerTask(){
            @Override
            public void run(){
                Date horaActual = new Date();
                
                if(activarSegundos){
                    setText(horaConSegundos.format(horaActual));
                } else {
                    setText(horaSinSegundos.format(horaActual));
                }
                
                /*
                
                if(alarma != null){
                    if(alarma.isActiva() && !alarma.isSonando() && horaActual.compareTo(alarma.getHoraAlarma()) >= 0 ){
                        
                        alarma.setSonando(true);
                        
                    }
                }
                */
            }
        }, 0, 1000);
        
    }

    public boolean isActivarSegundos() {
        return activarSegundos;
    }

    public void setActivarSegundos(boolean activarSegundos) {
        this.activarSegundos = activarSegundos;
    }

    public Alarma getAlarma() {
        return alarma;
    }

    public void setAlarma(Alarma alarma) {
        this.alarma = alarma;
    }
        
}
