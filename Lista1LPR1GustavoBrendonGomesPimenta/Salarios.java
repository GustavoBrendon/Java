/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salarios;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Salarios {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] salarios = new double[10];

        double soma = 0;
        double maiorSalario = Double.MIN_VALUE;
        double menorSalario = Double.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o salário do funcionário " + (i + 1) + ": ");
            salarios[i] = scanner.nextDouble();
            soma += salarios[i];
            if (salarios[i] > maiorSalario) {
                maiorSalario = salarios[i];
            }
            if (salarios[i] < menorSalario) {
                menorSalario = salarios[i];
            }
        }

        double media = soma / 10;

        System.out.println("a) Soma dos salários: " + soma);
        System.out.println("b) Maior salário: " + maiorSalario);
        System.out.println("c) Menor salário: " + menorSalario);
        System.out.println("d) Média dos salários: " + media);
    }
}

