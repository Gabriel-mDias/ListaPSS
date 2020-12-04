/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.proxy;

import br.ufes.regraNegocio2.ControladorBloqueio;

/**
 *
 * @author gabriel
 */
public class ProxyBloquearMensagem implements BloquearMensagem{
    
    private ControladorBloqueio controler;
    
    public ProxyBloquearMensagem(){
        controler = new ControladorBloqueio();
    }

    @Override
    public String bloquearMensagem(String mensagem) {
        return controler.bloquearMensagem(mensagem);
    }
    
}
