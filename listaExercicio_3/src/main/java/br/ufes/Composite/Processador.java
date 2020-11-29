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
public class Processador extends ComponenteComposto{

    public Processador(double precoInicial) {
        super(precoInicial);
    }

    @Override
    public String descricao() {
        if(this.getElementos().isEmpty()){
            return "Um processador que não possui componentes. Seu valor é de: "+ this.getPreco();
        }
     
        String descricao = "Um processador de valor: "+ this.getPrecoIndividual() +" que contém: \n";
        for(Componente c : this.getElementos()){
            descricao = descricao.concat(c.descricao()) + "\n";
        }
        
        return descricao + "E seu preço final é: " + this.getPreco(); 
    }
    
    @Override
    public double getPreco() {
        double precoTotal = this.getPrecoIndividual();
        for(Componente c : this.getElementos()){
            precoTotal += c.getPreco();
        }
        
        return precoTotal;
    }
    
}
