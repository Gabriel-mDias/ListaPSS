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
public abstract class ComputadorBuilder {
    
    private Computador computador;
    
    public abstract void create();
    public abstract void adicionarItens();

    public Computador getComputador() {
        return computador;
    }

    public void setComputador(Computador computador) {
        this.computador = computador;
    }
     
}
