/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista2lpr1gustavobrendongomespimenta;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Functions {
    private Scanner scanner = new Scanner(System.in);

    private Controle controle = new Controle();

    private void Menu() {
        System.out.println("------------------------------");
        System.out.println("||    1 - Incluir Produto   ||");
        System.out.println("||    2 - Incluir Pedido    ||");
        System.out.println("||    3 - Listar Produto    ||");
        System.out.println("||    4 - Listar Pedido     ||");
        System.out.println("||    5 - Sair do Sistema   ||");
        System.out.println("------------------------------");
    }

    public void listarProduto() {
        System.out.println("Quantiade de produtos " + controle.getListaProduto().size());
    }

    public void listarPedido() {
        System.out.println("Quantiade de pedidos " + controle.getListaPedido().size());
    }

    public void cadastrarProduto() {
        System.out.println("Cadastrando Produto");
        System.out.println("Informe o codigo do produto: ");

        int codigo = scanner.nextInt();

        if (!controle.existeCodigoProduto(codigo)) {
            Produto p = new Produto();
            p.setCod(codigo);
            //sc.reset();
            scanner.skip("\n");
            System.out.println("Informe o nome do produto: ");
            p.setNome(scanner.nextLine());
            scanner.reset();
            System.out.println("Informe o preco do produto: ");
            p.setPreco(scanner.nextFloat());

            controle.getListaProduto().add(p);

        } else {
            System.out.println("Produto ja cadastrado");
        }
    }

    public void cadastrarPedido() {
        System.out.println("Cadastrando Pedido");
        System.out.println("Informe o codigo do pedido: ");

        int codigo = scanner.nextInt();

        if (!controle.existeCodigoPedido(codigo)) {
            Pedido pe = new Pedido();
            pe.setCodigo(codigo);
            //sc.reset();
            scanner.skip("\n");
            System.out.println("Informe o nome do produto: ");
            pe.setDescricao(scanner.nextLine());

            controle.getListaPedido().add(pe);

        } else {
            System.out.println("Pedido ja cadastrado");
        }
    }

    public void executar() {
        int escolha;
        do {
            Menu();

            escolha = scanner.nextInt();
            if (escolha > 4 || escolha < 1) {
                escolha = -1;
            }
            switch (escolha) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    cadastrarPedido();
                    break;
                case 3:
                    listarProduto();
                    break;
                case 4:
                    listarPedido();
                    break;
                default:
                    break;

            }

        } while (escolha != -1);

    }
}
