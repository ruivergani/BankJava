/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsuldeminas.banco;

import br.edu.ifsuldeminas.banco.conta.ContaCorrente;
import br.edu.ifsuldeminas.banco.sistema.GerenciadorDeImpostoDeRenda;
import br.edu.ifsuldeminas.banco.sistema.SeguroDeVida;

/**
 *
 * @author Rui Vergani Neto
 */
public class TestaGerenciadorDeImpostoDeRenda {
    public static void main(String[] args) {
        GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
        SeguroDeVida sv = new SeguroDeVida();
        gerenciador.adiciona(sv); //polimorfismo foi possivel pois o sv é implements tributavel e quando criou o metodo que passava o polimorfismo o tipo era tributario
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(1000);
        gerenciador.adiciona(cc);
        System.out.println(gerenciador.getTotal());
        System.out.printf("O saldo é: %.2f", cc.getSaldo());
}}

