/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.regraNegocio2;

/**
 *
 * @author gabriel
 */
public class PHandler extends MensagemHandler{

    public PHandler() {
        super(new HrefHandler(), "<p");
    }
    
}
