/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.regraNegocio1;

/**
 *
 * @author gabriel
 */
public class MicrosoftCensura extends ICensura{

    public MicrosoftCensura(){
        this.setProibida("Microsoft");
    }
    
    @Override
    public String censurar(String texto) {
        return UtilitarioString.getUtil().substitui(texto, getProibida(), "*");
    }
    
}
