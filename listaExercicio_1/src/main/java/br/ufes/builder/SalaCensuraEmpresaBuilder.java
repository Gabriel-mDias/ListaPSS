/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.builder;

import br.ufes.chat.SalaChat;
import br.ufes.proxy.ProxyCensurarMensagem;

/**
 *
 * @author gabriel
 */
public class SalaCensuraEmpresaBuilder extends SalaBuilder{

    @Override
    public void createSalaChat() {
        this.setProxy(new ProxyCensurarMensagem());
        this.setSala(new SalaChat());
    }


}
