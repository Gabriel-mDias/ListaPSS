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
public interface MediadorChat {
    
    public void enviar(String mensagem, Participante participante);
    public Participante criarParticipante(String name, MediadorChat mediador);
}
