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
public class Controle {
    private List<Pedido> listaPedido = new ArrayList<>();
    
    private List<Produto> listaProduto = new ArrayList<>();
    
    public List<Produto> getListaProduto() {
        return listaProduto;
    }


    public void setListaProduto(List<Produto> listaProduto) {
        this.listaProduto = listaProduto;
    }
    
    
    public List<Pedido> getListaPedido() {
        return listaPedido;
    }

    public void setListaPedido(List<Pedido> listaPedido) {
        this.listaPedido = listaPedido;
    }
    
    public boolean existeCodigoPedido(int codigo) {
        for (Pedido elem : listaPedido) {
            if(elem.getCodigo() == codigo){
                return true;
            }
            
        }
        return false;
    }
    
    public boolean existeCodigoProduto(int cod) {
        for (Produto elem : listaProduto) {
            if(elem.getCod() == cod){
                return true;
            }
            
        }
        return false;
    }
}
