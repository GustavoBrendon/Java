/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista2lpr1gustavobrendongomespimenta;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo
 */
public class Pedido {
    private int codigo;
    private String descricao;
    private List<Produto> listaProduto = new ArrayList<>();
   
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public String getDescricao() {
        return descricao;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public List<Produto> getListaProduto() {
        return listaProduto;
    }


    public void setListaProduto(List<Produto> listaProduto) {
        this.listaProduto = listaProduto;
    }
    

}

