
package model;

import java.sql.Date;

/**
 *
 * @author Ezequiel Ngunga Nhime
 */
public class Alimento {
    private long id;
    private String nome;
    private double valor;
    private int estoqueInit;
    private int estoqueFinal;
    private Date data;

    public Alimento() {
    }

    public Alimento(String nome, double valor, int estoqueInit, int estoqueFinal, Date data) {
        this.nome = nome;
        this.valor = valor;
        this.estoqueInit = estoqueInit;
        this.estoqueFinal = estoqueFinal;
        this.data = data;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getEstoqueInit() {
        return estoqueInit;
    }

    public void setEstoqueInit(int estoqueInit) {
        this.estoqueInit = estoqueInit;
    }

    public int getEstoqueFinal() {
        return estoqueFinal;
    }

    public void setEstoqueFinal(int estoqueFinal) {
        this.estoqueFinal = estoqueFinal;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    
}
