/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.builder;

import br.ufes.sanduiche_decorator.*;

/**
 *
 * @author gabriel
 */
public class Americano extends SanduicheBuilder{

    @Override
    public void createSanduiche() {
        this.setSanduiche(new Sanduiche());
    }

    @Override
    public void addPao() {
        this.setSanduiche(new Ingrediente(this.getSanduiche(), 0.25, "Pão Bola"));
    }

    @Override
    public void addIngredientes() {
        this.setSanduiche(new Ingrediente(this.getSanduiche(), 0.5, "Presunto"));
        this.setSanduiche(new Ingrediente(this.getSanduiche(), 0.7, "Queijo"));
        this.setSanduiche(new Ingrediente(this.getSanduiche(), 0.2, "Ovo"));
        this.setSanduiche(new Ingrediente(this.getSanduiche(), 0.15, "Alface"));
        this.setSanduiche(new Ingrediente(this.getSanduiche(), 0.3, "Tomate"));
        this.setSanduiche(new Ingrediente(this.getSanduiche(), 0.1, "Maionese"));
    }
      
}
