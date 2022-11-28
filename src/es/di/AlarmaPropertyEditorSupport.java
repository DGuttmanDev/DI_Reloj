/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.di;

import es.di.panel.AlarmaPanel;
import es.di.model.Alarma;
import java.awt.Component;
import java.beans.PropertyEditorSupport;
import java.util.Date;

/**
 *
 * @author dguttman
 */
public class AlarmaPropertyEditorSupport extends PropertyEditorSupport{
    
    private AlarmaPanel alarmaPanel = new AlarmaPanel();

    @Override
    public boolean supportsCustomEditor() {
        return true;
    }

    @Override
    public Component getCustomEditor() {
        return alarmaPanel;
    }

    @Override
    public String getJavaInitializationString() {
        Date horaAlarma = alarmaPanel.getAlarma().getHoraAlarma();
        boolean activa = alarmaPanel.getAlarma().isActiva();
        return"new model.Alarma(new java.util.Date("+horaAlarma.getTime()+"l),"+activa+")";
    }

    @Override
    public Object getValue() {
        return alarmaPanel.getAlarma();
    }

    @Override
    public void setValue(Object value) {
        super.setValue(value); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
