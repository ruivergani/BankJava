/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsuldeminas.banco.conta;

/**
 *
 * @author Rui Vergani
 */
public class ContaCorrente extends Conta implements Tributavel{
    
    @Override
    public void atualiza (double taxa){
          this.saldo = this.saldo * (2 * taxa); 
    }
    @Override
    public void deposita(double quantidade){
          super.deposita(quantidade - 0.10);
        /* this.saldo = this.saldo + quantidade - 0.10; */ 
    }

    @Override
    public double calculaTributos() {
        return this.getSaldo() * 0.01;
    }
}
