/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.proxy;

import br.ufes.chat.Participante;
import br.ufes.chat.SalaChat;
import br.ufes.regraNegocio2.ControladorBloqueio;

/**
 *
 * @author gabriel
 */
public class ProxyBloquearMensagem extends ProxyGenerico{
    
    private ControladorBloqueio controler;
    private SalaChat sala;
    
    public ProxyBloquearMensagem(){
        controler = new ControladorBloqueio();
    }

    @Override
    public String validarMensagem(String mensagem) {
        return controler.validarMensagem(mensagem);
    }
    
    @Override
    public void enviar(String mensagem, Participante p){
        this.getSala().enviar(this.validarMensagem(mensagem), p);
    }
    
}
