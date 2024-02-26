/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.intervalos;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Intervalos {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int segundoNumero = scanner.nextInt();

        for (int i = primeiroNumero + 1; i < segundoNumero; i++) {
            System.out.print(i);
        }
    }
}
