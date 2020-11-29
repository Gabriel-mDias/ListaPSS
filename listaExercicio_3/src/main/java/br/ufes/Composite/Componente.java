/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.Composite;

/**
 *
 * @author gabriel
 */
public abstract class Componente {
    
    private double precoIndividual;
    
    public abstract String descricao();
    public abstract double getPreco();
    
    public void setPrecoIndividual(double preco){
        this.precoIndividual = preco;
    }

    public double getPrecoIndividual() {
        return precoIndividual;
    }
    
}
