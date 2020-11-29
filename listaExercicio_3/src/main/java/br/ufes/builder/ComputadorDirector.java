/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.builder;

import br.ufes.Composite.Computador;

/**
 *
 * @author gabriel
 */
public class ComputadorDirector {
    
    private ComputadorBuilder builder;

    public ComputadorDirector(ComputadorBuilder builder) {
        this.builder = builder;
    }
    
    public Computador builder(){
        this.builder.create();
        this.builder.adicionarItens();
        return this.builder.getComputador();
    }
    
}
