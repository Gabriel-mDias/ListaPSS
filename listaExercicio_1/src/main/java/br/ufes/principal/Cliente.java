/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.principal;

import br.ufes.builder.SalaBloqueiaHTMLBuilder;
import br.ufes.builder.SalaCensuraEmpresaBuilder;
import br.ufes.builder.SalaDiretor;
import br.ufes.chat.Participante;
import br.ufes.chat.ParticipanteChat;
import br.ufes.chat.SalaChat;
import br.ufes.proxy.ProxyCensurarMensagem;
import br.ufes.proxy.ProxyGenerico;

/**
 *
 * @author gabriel
 */
public class Cliente {
    
    public static void main(String[] args) {
        
        
        
        SalaDiretor diretor = new SalaDiretor(new SalaCensuraEmpresaBuilder());
        ProxyGenerico salaEmpresas = diretor.build();
        
        Participante fulano = new ParticipanteChat(salaEmpresas.getSala(), "Fulano");
        Participante beltrano = new ParticipanteChat(salaEmpresas.getSala(), "Beltrano");
        Participante sicrano = new ParticipanteChat(salaEmpresas.getSala(), "Sicrano");
        
        salaEmpresas.getSala().criarParticipante(fulano.getName(), salaEmpresas.getSala());
        salaEmpresas.getSala().criarParticipante(sicrano.getName(), salaEmpresas.getSala());
        salaEmpresas.getSala().criarParticipante(beltrano.getName(), salaEmpresas.getSala());
        
        salaEmpresas.enviar("Estou usando o Facebook dentro da empresa Microsoft! Vou até te enviar uma foto", sicrano);
        
        diretor = new SalaDiretor(new SalaBloqueiaHTMLBuilder());
        ProxyGenerico salaHTML = diretor.build();
        
        salaHTML.getSala().criarParticipante(fulano.getName(), salaHTML.getSala());
        salaHTML.getSala().criarParticipante(sicrano.getName(), salaHTML.getSala());
        salaHTML.getSala().criarParticipante(beltrano.getName(), salaHTML.getSala());
        
        salaHTML.enviar("<img Moscando durante o trabalho img>", sicrano);
    }
}
