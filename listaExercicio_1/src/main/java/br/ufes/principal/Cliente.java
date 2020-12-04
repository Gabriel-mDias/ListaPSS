/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.principal;

import br.ufes.regraNegocio1.*;

/**
 *
 * @author gabriel
 */
public class Cliente {
    
    public static void main(String[] args) {
        //O padrões de projetos adotados foram o Singleton e o Strategy além do Princípio de Aberto e Fechado
        ControlerPalavras controler = new ControlerPalavras("A Microsoft, Apple e IBM são pioneiras, mas a Facebook não deixa a desejar");
        
        
        
        System.out.println(controler.toString());
    }
}
