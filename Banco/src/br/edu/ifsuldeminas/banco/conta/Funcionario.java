/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsuldeminas.banco.conta;



/**
 *
 * @author Convidado
 */
abstract public class Funcionario{ // classe abstrata, não deixando ser instanciada //
    public String nome; 
    public String cpf;
    public double salario;
    
    
    
  abstract public double getBonificacao(); // metodo abstrato, obrigando todas classes filhas instanciar //

    void mostraDados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
  
  }
    
    
    
    

