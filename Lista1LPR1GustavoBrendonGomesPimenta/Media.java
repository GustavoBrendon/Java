/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.media;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Media {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        double somaPrimeirosCinco = 0;
        double somaUltimosCinco = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            if (i < 5) {
                somaPrimeirosCinco += numeros[i];
            } else {
                somaUltimosCinco += numeros[i];
            }
        }

        double mediaPrimeirosCinco = somaPrimeirosCinco / 5;
        double mediaUltimosCinco = somaUltimosCinco / 5;
        double somaDasMedias = mediaPrimeirosCinco + mediaUltimosCinco;

        System.out.println("Soma das médias: " + somaDasMedias);
        System.out.println("Maior média: " + Math.max(mediaPrimeirosCinco, mediaUltimosCinco));
        System.out.println("Média das duas médias: " + (somaDasMedias / 2));
    }
}
