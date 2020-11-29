/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.sanduiche_decorator;

/**
 *
 * @author gabriel
 */
public abstract class ElementoSanduiche {
    
    protected double preco;
    protected String descricao;
    
    public abstract double getPreco();
    public abstract String getDescricao();

}
