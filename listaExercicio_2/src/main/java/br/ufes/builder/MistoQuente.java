/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.builder;

import br.ufes.sanduiche_decorator.Ingrediente;

/**
 *
 * @author gabriel
 */
public class MistoQuente extends SanduicheBuilder{

    @Override
    public void addPao() {
        this.setSanduiche(new Ingrediente(this.getSanduiche(), 0.25, "Pão de Forma"));
    }

    @Override
    public void addIngredientes() {
        this.setSanduiche(new Ingrediente(this.getSanduiche(), 0.7, "Queijo"));
        this.setSanduiche(new Ingrediente(this.getSanduiche(), 0.5, "Presunto"));
    }
    
}
