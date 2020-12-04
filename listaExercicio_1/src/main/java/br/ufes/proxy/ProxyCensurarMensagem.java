/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.proxy;

import br.ufes.regraNegocio1.ControlerPalavras;

/**
 *
 * @author gabriel
 */
public class ProxyCensurarMensagem implements CensuraMensagem{

    private ControlerPalavras controlador;

    public ProxyCensurarMensagem(String mensagem) {
        controlador = new ControlerPalavras(mensagem);
    }
    
    @Override
    public String censurar() {
        return controlador.censurar();
    }
    
}
