/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.regraNegocio1;

import java.util.ArrayList;

/**
 *
 * @author gabriel
 */
public class UtilitarioString {

    private static UtilitarioString util = null;
    private ArrayList<String> palavrasCensura;
    
    private UtilitarioString() {
        palavrasCensura = new ArrayList<>();
    }
    
    public String substitui(String texto, String palavra, CharSequence simbolo){
        String censura = "";
        
        while(censura.length()<palavra.length()){
            censura = censura.concat(simbolo.toString());
        }
        
        return texto.replace(palavra, censura);
    }

    public static UtilitarioString getUtil() {
        if(util==null){
            util = new UtilitarioString();
        }
        return util;
    }
    
    
}
