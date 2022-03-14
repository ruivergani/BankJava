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
    public class Gerente extends Funcionario{ /*gerente herdou da tudo que tem na classe funcionario */
        
    public int senha;
    public int numeroDeFuncionarioGerenciados;
    
    boolean autentica(int senha){
    if(this.senha == senha){
        System.out.println("Acesso Permitido!");
        return true;
    }
    else{
        System.out.println("Acesso Negado!");
        return false;
    }
    }
    
    /*metodo reescrito, então em vez de buscar de funcionario, busca desse. */  
    @Override
    public void mostraDados(){
        super.mostraDados(); /*chama o que está dentro do metodo lá de funcionario */
        System.out.println("Numero de Funcionario: " +this.numeroDeFuncionarioGerenciados);
    }

    @Override
    public double getBonificacao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
