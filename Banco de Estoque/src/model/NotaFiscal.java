/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Ezequiel Ngunga Nhime 
 */
public class NotaFiscal {
    private long id;
    private String nomeFornecedor;
    private double valor;
    private long numero; 

    public NotaFiscal() {
    }

    public NotaFiscal(String nomeFornecedor, double valor, long numero) {
        this.nomeFornecedor = nomeFornecedor;
        this.valor = valor;
        this.numero = numero;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

   
    
    
}
