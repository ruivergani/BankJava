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
public class ContaPoupança extends Conta implements Comparable<ContaPoupança>{
    
    @Override
    public void atualiza (double taxa){
        this.saldo = this.saldo + this.saldo *  (3 * taxa);
    }

    @Override
    public int compareTo(ContaPoupança o){
    if (this.getNumero() < o.getNumero()) {
    return -1;
    }
    if (this.getNumero() > o.getNumero()) {
    return 1;
    }
    return 0;
}}
