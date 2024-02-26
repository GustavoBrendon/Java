/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tiposdeclasses;

/**
 *
 * @author Gustavo
 */
public class TiposDeClasses {

    public static void main(String[] args) {
        
        //Convertendo uma string para float
        Float stringFloat = Float.valueOf("134.87");
        System.out.println("Convertendo uma string para Float: " + stringFloat);
        
        //Convertendo uma string para Integer
        Integer stringInteger = Integer.valueOf("7639");
        System.out.println("Convertendo uma string para Integer: " + stringInteger);
        
        //Convertendo uma string para Double
        Double stringDouble = Double.valueOf("1245.67");
        System.out.println("Convertendo uma string para Double: " + stringDouble);
        
        //O construtors da classe aceita paenas um char
        Character character = 'a';
        System.out.println("O construtors da classe aceita apenas um char: " + character.toString());
        
        //Os tipos podem ser criados atribuindo valor no construto da classe
        Float valorFloat = new Float(500,50);
        System.out.println("Float: " + valorFloat);
        
        Integer valorInteger = 2800;
        System.out.println("Integer: " + valorInteger);
        
        Double valorDouble = new Double(512,22);
        System.out.println("Double: " + valorDouble);
        
        Boolean valor1 = new Boolean("true");
        System.out.println("Valor 1: " + valor1.toString());
        
        Boolean valor2= new Boolean("TRUE");
        System.out.println("Valor 2: " + valor2.toString());
        
        Boolean Valor3 = new Boolean("false");
        System.out.println("Valor 3: " + valo3.toString());
        
        Boolean Valor4 = new Boolean ("FALSE");
        System.out.println("Valor 4: " + valor4.toString());
        
        System.out.println("Comparação mesmo valor: " + valor4.equals(valor3));
        System.out.println("Comparação valor diferente: " + valor4.equals(valor1));
        
        
    }
}
