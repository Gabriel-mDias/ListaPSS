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
public class ParticipanteChat extends Participante{
    
    private String name;

    public ParticipanteChat(MediadorChat mediador, String participanteName){
        this.name = participanteName;
    }
    
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void enviar(String mensagem) {
        this.getMediador().enviar(mensagem, this);
    }

    @Override
    public void receber(String mensagem, Participante participante) {
        System.out.println(participante.getName() + " diz: " + mensagem);
    }
    
    
    
}
