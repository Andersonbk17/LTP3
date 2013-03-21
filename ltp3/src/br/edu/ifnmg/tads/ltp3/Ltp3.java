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
     
        docente a = new docente();
        
        endereco as = new endereco();
        
        as.setCidade("januaria");
        
        a.addEndereco(as);
        
      System.out.print(a.toString());
        
        
        
    }
}
