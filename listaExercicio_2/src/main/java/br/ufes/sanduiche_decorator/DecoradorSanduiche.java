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
public abstract class DecoradorSanduiche extends ElementoSanduiche{

    private ElementoSanduiche elemento;

    public DecoradorSanduiche(ElementoSanduiche elemento, double preco, String descricao) {
        this.preco = preco;
        this.descricao = descricao;
        this.elemento = elemento;
    }

    public ElementoSanduiche getElemento() {
        return elemento;
    }
}
