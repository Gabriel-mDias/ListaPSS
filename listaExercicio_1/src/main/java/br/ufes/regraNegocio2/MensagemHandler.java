/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.regraNegocio2;

/**
 *
 * @author gabriel
 */
public abstract class MensagemHandler {
    
    private MensagemHandler next;
    private String tag;
    

    public MensagemHandler(MensagemHandler next, String tag) {
        this.next = next;
        this.tag = tag;
    }
    
    public String verificarTag(String mensagem){
        if(mensagem.contains(tag)){
            return "Mensagem removida por conter conteúdo não autorizado";
        }
        
        if(this.next != null){
            return next.verificarTag(mensagem);
        }
        
        return mensagem;
    }

    public void setNext(MensagemHandler next) {
        this.next = next;
    }
}
