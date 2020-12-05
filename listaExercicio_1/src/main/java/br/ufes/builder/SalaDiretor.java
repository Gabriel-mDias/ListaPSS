/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.builder;

import br.ufes.proxy.ProxyGenerico;

/**
 *
 * @author gabriel
 */
public class SalaDiretor {

    private SalaBuilder s;

    public SalaDiretor(SalaBuilder s) {
        this.s = s;
    }
    
    public ProxyGenerico build() {
        s.createSalaChat();
        return s.getProxy();
    }

    
}
