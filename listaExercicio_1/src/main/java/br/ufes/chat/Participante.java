/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.chat;

/**
 *
 * @author gabriel
 */
public abstract class Participante {
    
    private MediadorChat mediador;
    
    public abstract String getName();
    public abstract void enviar(String mensagem);
    public abstract void receber(String mensagem, Participante participante);

    public MediadorChat getMediador() {
        return mediador;
    }

    public void setMediador(MediadorChat mediador) {
        this.mediador = mediador;
    }
    
}
