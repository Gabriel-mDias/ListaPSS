/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.Composite;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author gabriel
 */
public abstract class ComponenteComposto extends Componente{
    
    protected Collection<Componente> elementos;

    public ComponenteComposto(double precoInicial) {
        this.elementos = new ArrayList<>();
        this.setPrecoIndividual(precoInicial); //É o valor inicial do componente, sem contar seus elementos
    }
    
    public void addComponente(Componente c){
        this.elementos.add(c);
    }
    
    public ComponenteComposto comComponente(Componente c){
        this.addComponente(c);
        return this;
    }

    public Collection<Componente> getElementos() {
        return elementos;
    }
    
}
