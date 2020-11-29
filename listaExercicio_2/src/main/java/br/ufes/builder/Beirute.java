/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.builder;

import br.ufes.sanduiche_decorator.Ingrediente;
import br.ufes.sanduiche_decorator.Sanduiche;

/**
 *
 * @author gabriel
 */
public class Beirute extends SanduicheBuilder{

    @Override
    public void createSanduiche() {
        this.setSanduiche(new Sanduiche());
    }

    @Override
    public void addPao() {
        this.setSanduiche(new Ingrediente(this.getSanduiche(), 0.25, "Pão Sírio"));
    }

    @Override
    public void addIngredientes() {
        this.setSanduiche(new Ingrediente(this.getSanduiche(), 0.3, "Rosbife"));
        this.setSanduiche(new Ingrediente(this.getSanduiche(), 0.7, "Queijo"));
        this.setSanduiche(new Ingrediente(this.getSanduiche(), 0.3, "Ovo Frito"));
        this.setSanduiche(new Ingrediente(this.getSanduiche(), 0.15, "Alface"));
        this.setSanduiche(new Ingrediente(this.getSanduiche(), 0.3, "Tomate"));
    }
    
}
