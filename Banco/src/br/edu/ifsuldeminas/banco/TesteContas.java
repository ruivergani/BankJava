/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsuldeminas.banco;

import br.edu.ifsuldeminas.banco.conta.Conta;
import br.edu.ifsuldeminas.banco.conta.ContaCorrente;
import br.edu.ifsuldeminas.banco.conta.ContaPoupança;

/**
 *
 * @author Rui Vergani
 */
public class TesteContas {
    public static void main(String[] args) {
       Conta c = new Conta() {
           @Override
           public void atualiza(double taxa) {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }
       };
       ContaCorrente cc = new ContaCorrente();
       ContaPoupança cp = new ContaPoupança();
       
       c.deposita(1000);
       cc.deposita(1000);
       cp.deposita(1000);
       c.atualiza(0.10);
       cc.atualiza(0.10);
       cp.atualiza(0.10);
       System.out.println(c.getSaldo());
       System.out.println(cc.getSaldo());
       System.out.println(cp.getSaldo());


    }
}
