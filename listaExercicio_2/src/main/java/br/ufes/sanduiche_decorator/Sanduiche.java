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
public class Sanduiche extends ElementoSanduiche{

    public Sanduiche() {
    }
    
    @Override
    public double getPreco() {
        return 0.80; //Preço inicial de um lanche
    }

    @Override
    public String getDescricao() {
        return "Esse sanduiche contem: ";
    }
    
}
