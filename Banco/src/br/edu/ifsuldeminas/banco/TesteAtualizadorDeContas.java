/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsuldeminas.banco;

import br.edu.ifsuldeminas.banco.conta.Conta;
import br.edu.ifsuldeminas.banco.conta.ContaCorrente;
import br.edu.ifsuldeminas.banco.sistema.AtualizadorDeContas;





/**
 *
 * @author rui vergani
 */
public class TesteAtualizadorDeContas {
    public static void main(String[] args) {
       // Conta c = new Conta();//
        Conta cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        
       // c.deposita(1000);//
        cc.deposita(1000);
        cp.deposita(1000);
        
        AtualizadorDeContas adc = new AtualizadorDeContas(0.10);
        
       // adc.roda(c);//
        adc.roda(cc);
        adc.roda(cp);
        
        System.out.println("Saldo Total: " + adc.getSaldoTotal());
}

        
        
        
        
        
        
        
        
        
        
      /*  Conta c = new Conta();
        
        ContaCorrente cc= new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        
        
        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);
        
        c.atualiza(0.10);
        cc.atualiza(0.10);
        cp.atualiza(0.10);
        
        System.out.println(""+c.getSaldo());
        System.out.println(""+cc.getSaldo());
        System.out.println(""+cp.getSaldo());
    }
*/
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
