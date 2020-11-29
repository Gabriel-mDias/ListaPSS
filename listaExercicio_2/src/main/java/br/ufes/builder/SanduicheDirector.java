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
public class SanduicheDirector {
    
    private SanduicheBuilder builder;

    public SanduicheDirector(SanduicheBuilder builder) {
        this.builder = builder;
    }
    
    public ElementoSanduiche builder(){
        this.builder.createSanduiche();
        this.builder.addPao();
        this.builder.addIngredientes();
        return this.builder.getSanduiche();
    }
    
}
