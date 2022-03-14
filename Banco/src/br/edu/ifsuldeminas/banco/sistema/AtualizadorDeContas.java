/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsuldeminas.banco.sistema;

import br.edu.ifsuldeminas.banco.ContaPoupanca;
import br.edu.ifsuldeminas.banco.conta.Conta;



/**
 *
 * @author rui vergani
 */
public class AtualizadorDeContas {
    public double saldoTotal = 0;
    public double selic;
    
    public AtualizadorDeContas(double selic){
       this.selic = selic;
    }
    
   public void roda(Conta c){
       System.out.println("Saldo ANTERIOR: " +c.getSaldo());
       c.atualiza(selic);
       saldoTotal = saldoTotal + c.getSaldo();
       System.out.println("Saldo ATUAL: " +c.getSaldo());
    }

    /* Getter and Setter*/
    
    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public double getSelic() {
        return selic;
    }

    public void setSelic(double selic) {
        this.selic = selic;
    }

    public void roda(ContaPoupanca cp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
