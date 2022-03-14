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
public class SeguroDeVida implements Tributavel{

    @Override
    public double calculaTributos() {
       return 42;
      // obriga a ter valores nos metodos
    }
    
}
