/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsuldeminas.banco;

import br.edu.ifsuldeminas.banco.conta.ContaCorrente;
import br.edu.ifsuldeminas.banco.conta.Tributavel;

/**
 *
 * @author Rui Vergani Neto
 */
public class TestaTributavel {
    public static void main(String[] args) {
    
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(100);
        System.out.println(cc.calculaTributos());
       
        // testando polimorfismo:
        Tributavel t = cc;
        System.out.println(t.calculaTributos());
        
        // Da um erro se tentar chamar o saldo pelo t, pois t recebe cc que é onde se encontra o saldo e t é uma variavel
        // da classe interface sendo assim não podendo ser instanciada.
}

    }

