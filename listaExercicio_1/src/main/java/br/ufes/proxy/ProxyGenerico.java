/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.proxy;

import br.ufes.chat.Participante;
import br.ufes.chat.SalaChat;

/**
 *
 * @author gabriel
 */
public abstract class ProxyGenerico implements ProxyMensagem{
    
    private SalaChat sala;

    public SalaChat getSala() {
        return sala;
    }

    public void setSala(SalaChat sala) {
        this.sala = sala;
    }
    
    public abstract void enviar(String mensagem, Participante p);
}
