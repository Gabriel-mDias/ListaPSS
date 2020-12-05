/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.regraNegocio2;

import br.ufes.proxy.ProxyMensagem;

/**
 *
 * @author gabriel
 */
public class ControladorBloqueio implements ProxyMensagem{
    
    public MensagemHandler primeiro;
    
    public ControladorBloqueio(){
        primeiro = new ImgHandler();
    }

    @Override
    public String validarMensagem(String mensagem) {
        return primeiro.verificarTag(mensagem);
    }
    
}
