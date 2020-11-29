/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.builder;

import br.ufes.sanduiche_decorator.ElementoSanduiche;
import br.ufes.sanduiche_decorator.Ingrediente;

/**
 *
 * @author gabriel
 */
public class Cheeseburger extends SanduicheBuilder{
    
    @Override
    public void createSanduiche(){
        SanduicheDirector construtor = new SanduicheDirector(new Hamburger());
        ElementoSanduiche hamburger = construtor.builder();
        this.setSanduiche(hamburger);
    }

    @Override
    public void addPao() {  //Nesse não há necessidade de implementar um addPão já que é usado como base, um hamburger
        
    }

    @Override
    public void addIngredientes() {
        this.setSanduiche(new Ingrediente(this.getSanduiche(), 0.7, "Queijo"));
    }
    
}
