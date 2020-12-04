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
public abstract class ICensura{
    
    private String proibida;
    
    public abstract String censurar(String texto);

    public String getProibida() {
        return proibida;
    }

    public void setProibida(String proibida) {
        this.proibida = proibida;
    }
}
