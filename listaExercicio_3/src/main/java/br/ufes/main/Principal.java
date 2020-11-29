/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.main;

import br.ufes.Composite.*;
import br.ufes.builder.ComputadorBasicoBuilder;
import br.ufes.builder.ComputadorDirector;
import br.ufes.builder.ComputadorGamerBuilder;

/**
 *
 * @author gabriel
 */
public class Principal {
    
    public static void main(String[] args) {
        ComputadorDirector controlador = new ComputadorDirector(new ComputadorGamerBuilder());
        Computador c = controlador.builder();
        
        System.out.println("Computador Gamer x Computador Básico:\nO Computador Gamer que temos:");
        
        System.out.println(c.descricao());
        
        System.out.println("O Computador Básico: ");
        controlador = new ComputadorDirector(new ComputadorBasicoBuilder());
        c = controlador.builder();
        
        System.out.println(c.descricao());
    }
}
