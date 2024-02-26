/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aulajava;

import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo
 */
public class AulaJava {

   public static void main (String[] args) {
     //Lendo as informações
     String primeiroNumero = JOptionPane.showInputDialog ("Informe O Primeiro Numero.");
     String segundoNumero = JOptionPane.showInputDialog ("Informe O Segundo Numero.");
                                                                                             
     //Convertendo OS valores
     int numero1 = Integer.parseInt(primeiroNumero);
     int numero2 = Integer.parseInt(segundoNumero);
     int soma = numero1 + numero2;
     
    JOptionPane.showMessageDialog(null, "O resultado é: " + soma);
   }}
