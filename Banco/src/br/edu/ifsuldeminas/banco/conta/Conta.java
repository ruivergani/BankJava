/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsuldeminas.banco.conta;

/**
 *
 * @author rui vergani
 */
abstract public class Conta {

    public int numero;
    public Cliente cliente;
    public double saldo;
    public double limite;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public boolean saca(double quantidade) {
        if (this.saldo >= quantidade) {
            this.saldo = this.saldo - quantidade;
            return true;
        } else {
            System.out.println("Saldo Insuficiente");
            return false;
        }
    }

    public void deposita(double quantidade) {
        this.saldo = this.saldo + quantidade;
       
    }

    public void transfere(Conta destino, double valor) {

        if (this.saca(valor) == true) {
            destino.deposita(valor);
        } else {
            System.out.println("Transferência não realizada");
        }
    }

    public abstract void atualiza(double taxa); 
   //this.saldo += this.saldo * taxa;
}
