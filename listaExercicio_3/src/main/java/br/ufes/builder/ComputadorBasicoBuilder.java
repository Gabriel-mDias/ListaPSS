/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.builder;

import br.ufes.Composite.Computador;
import br.ufes.Composite.*;

/**
 *
 * @author gabriel
 */
public class ComputadorBasicoBuilder extends ComputadorBuilder{

    @Override
    public void create() {
        this.setComputador(new Computador());
    }

    @Override
    public void adicionarItens() {
        this.getComputador().addComponente(new PlacaMae(80));
        this.getComputador().addComponente(new Processador(520));
        this.getComputador().addComponente(new Memoria(180));
    }
    
}
