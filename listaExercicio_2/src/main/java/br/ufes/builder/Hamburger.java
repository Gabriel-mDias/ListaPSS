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
public class Hamburger extends SanduicheBuilder{

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
        this.setSanduiche(new Ingrediente(this.getSanduiche(), 0.5, "Bolinho de carne"));
    }
    
}
