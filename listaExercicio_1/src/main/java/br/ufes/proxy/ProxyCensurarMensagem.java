/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.proxy;

import br.ufes.chat.Participante;
import br.ufes.chat.SalaChat;
import br.ufes.regraNegocio1.ControlerPalavras;

/**
 *
 * @author gabriel
 */
public class ProxyCensurarMensagem extends ProxyGenerico{

    private ControlerPalavras controlador;

    public ProxyCensurarMensagem() {
        controlador = new ControlerPalavras();
    }
    

    @Override
    public String validarMensagem(String mensagem) {
        return controlador.validarMensagem(mensagem);
    }
    
    public void enviar(String mensagem, Participante p){
        this.getSala().enviar(this.validarMensagem(mensagem), p);
    }
}
