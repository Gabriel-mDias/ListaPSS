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
public class Ingrediente extends DecoradorSanduiche{
    
    public Ingrediente(ElementoSanduiche elemento, double preco, String descricao) {
        super(elemento, preco, descricao);
    }

    @Override
    public double getPreco() {
        return this.getElemento().getPreco() + this.preco;
    }

    @Override
    public String getDescricao() {
        return this.getElemento().getDescricao() + "\n" + this.descricao;
    }
    
    
    
}
