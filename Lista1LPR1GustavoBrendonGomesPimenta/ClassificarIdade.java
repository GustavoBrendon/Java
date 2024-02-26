/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classificaridade;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class ClassificarIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] idades = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a idade " + (i + 1) + ": ");
            idades[i] = scanner.nextInt();
        }

        for (int idade : idades) {
            if (idade < 12) {
                System.out.println("Criança de até 12 anos incompletos");
            } else if (idade >= 12 && idade < 18) {
                System.out.println("De 12 a 18 anos adolescentes incompletos");
            } else if (idade >= 18 && idade < 30) {
                System.out.println("De 18 a 29 jovem");
            } else if (idade >= 30 && idade < 60) {
                System.out.println("De 30 a 59 adulto");
            } else {
                System.out.println("De 60 acima idoso");
            }
        }
    }
}