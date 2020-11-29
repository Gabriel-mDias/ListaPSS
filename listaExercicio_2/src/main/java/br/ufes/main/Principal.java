/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.main;

import br.ufes.builder.*;
import br.ufes.builder.SanduicheDirector;
import br.ufes.sanduiche_decorator.ElementoSanduiche;

/**
 *
 * @author gabriel
 */
public class Principal {
    
    public static void main(String[] args) {
        SanduicheDirector construtor = new SanduicheDirector(new Americano());
        ElementoSanduiche sanduicheGenerico = construtor.builder();
        
        System.out.println("Cardápio: \nAmericano: ");
        System.out.println(sanduicheGenerico.getDescricao() + "\nE o preço é: " +sanduicheGenerico.getPreco());
        
        System.out.println("Hambúrger: ");
        construtor = new SanduicheDirector(new Hamburger());
        sanduicheGenerico = construtor.builder();
        System.out.println(sanduicheGenerico.getDescricao() + "\nE o preço é: " +sanduicheGenerico.getPreco());
        
        System.out.println("Cheeseburger: ");
        construtor = new SanduicheDirector(new Cheeseburger());
        sanduicheGenerico = construtor.builder();
        System.out.println(sanduicheGenerico.getDescricao() + "\nE o preço é: " +sanduicheGenerico.getPreco());
        
        System.out.println("X-Salada: ");
        construtor = new SanduicheDirector(new XSalada());
        sanduicheGenerico = construtor.builder();
        System.out.println(sanduicheGenerico.getDescricao() + "\nE o preço é: " +sanduicheGenerico.getPreco());
    }
    
}
