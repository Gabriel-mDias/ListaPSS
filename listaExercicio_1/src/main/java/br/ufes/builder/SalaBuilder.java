/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.builder;

import br.ufes.chat.SalaChat;
import br.ufes.proxy.ProxyGenerico;

/**
 *
 * @author gabriel
 */
public abstract class SalaBuilder {
    
    private ProxyGenerico proxy;
    
    public abstract void createSalaChat();

    public SalaChat getSala() {
        return this.proxy.getSala();
    }

    public void setSala(SalaChat sala) {
        this.proxy.setSala(sala);
    }

    public ProxyGenerico getProxy() {
        return proxy;
    }

    public void setProxy(ProxyGenerico proxy) {
        this.proxy = proxy;
    }
    
    
}
