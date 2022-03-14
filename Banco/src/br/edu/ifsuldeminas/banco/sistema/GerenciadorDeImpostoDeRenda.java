/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsuldeminas.banco.sistema;

import br.edu.ifsuldeminas.banco.conta.Tributavel;

/**
 *
 * @author Rui Vergani Neto
 */
public class GerenciadorDeImpostoDeRenda {
   
   public double total;
    
   public void adiciona(Tributavel t){
   this.total += t.calculaTributos();
   System.out.println("Adicionando tributavel: " +t);
  
}
   public double getTotal(){
   return this.total;
}
}
