package models;

import java.util.ArrayList;

public class Venda {
    private Cliente cliente;
    private ArrayList<Produtos> produtos = new ArrayList();
    private float valorTotal;

    public Venda(Cliente cliente, ArrayList<Produtos> produtos){
        this.cliente = cliente;
        this.produtos = produtos;
    }

    public Cliente getCliente(){
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public ArrayList<Produtos> getProdutos(){
        return produtos;
    }

    public void setProdutos(ArrayList<Produtos> produtos){
        this.produtos = produtos;
    }

    public float calcularValorTotal(){
        for(produto : produtos){
            this.valorTotal += produto.quantidade * produto.produto.valorVenda;
        }
        return this.valorTotal;
    }
}
