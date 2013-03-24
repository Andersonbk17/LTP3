/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.ltp3;

import java.util.List;

/**
 *
 * @author Anderson
 */
public class Ltp3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
     
        Docente a = new Docente();
        
        Endereco as = new Endereco();
         Endereco ass = new Endereco();
        
        as.setCidade("januaria");
        ass.setCidade("januariadadasda");
        a.addEndereco(as);
        a.addEndereco(ass);
        
      System.out.print(a.toString());
        
        
        
    }
}
