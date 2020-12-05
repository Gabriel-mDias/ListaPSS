/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.builder;

import br.ufes.chat.SalaChat;
import br.ufes.proxy.ProxyBloquearMensagem;

/**
 *
 * @author gabriel
 */
public class SalaBloqueiaHTMLBuilder extends SalaBuilder{

    @Override
    public void createSalaChat() {
        this.setProxy(new ProxyBloquearMensagem());
        this.setSala(new SalaChat());
    }
    
}
