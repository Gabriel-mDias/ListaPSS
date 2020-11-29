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
public abstract class SanduicheBuilder {
    
    protected ElementoSanduiche sanduiche;
    
    public void createSanduiche(){
        this.setSanduiche(new Sanduiche()); //Esse método deveria ser abstrato, porém pela repetição do código, foi optado por implementa-lo
    }
    public abstract void addPao();
    public abstract void addIngredientes();
    
    public ElementoSanduiche getSanduiche(){
        return this.sanduiche;
    }

    public void setSanduiche(ElementoSanduiche sanduiche) {
        this.sanduiche = sanduiche;
    }
    
}
