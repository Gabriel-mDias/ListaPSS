/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.builder;

import br.ufes.proxy.ProxyBloquearMensagem;
import br.ufes.proxy.ProxyCensurarMensagem;

/**
 *
 * @author gabriel
 */
public abstract class SalaBuilder {
    
    private SalaChat sala;
    
    public abstract void createSalaChat();
    
    public abstract void enviar(String mensagem, ProxyCensurarMensagem proxyC, ProxyBloquearMensagem proxyB);
}
