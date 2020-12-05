/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.regraNegocio1;

import java.util.ArrayList;
import br.ufes.proxy.ProxyMensagem;

/**
 *
 * @author gabriel
 */
public class ControlerPalavras implements ProxyMensagem{
    
    private ArrayList<ICensura> censuras;
    private String entrada;

    public ControlerPalavras() {
        this.censuras = new ArrayList<>();
        
        //Adicione as empresas básicas no construtor
        this.addCensuras(new MicrosoftCensura());
        this.addCensuras(new AppleCensura());
        this.addCensuras(new FacebookCensura());
        this.addCensuras(new IBMCensura());
    }    
    
    
    public void addCensuras(ICensura c){
        this.censuras.add(c);
    }

    @Override
    public String toString() {
        String saida = entrada;
        for(ICensura c : censuras){
            saida = c.censurar(saida);
        }
        return saida;
    }

    @Override
    public String validarMensagem(String mensagem) {
        this.entrada = mensagem;
        return this.toString();
    }
    
    
}
