
package model;

import java.sql.Date;

/**
 *
 * @author Ezequiel Ngunga Nhime
 */
public class Lote {
    private long id;
    private int numero;
    private int qtdAlimentos;
    private Date data;    
    private Date entrada;
    private Date saida;

    public Lote() {
    }

    public Lote(int numero, int qtdAlimentos, Date data, Date entrada, Date saida) {
        this.numero = numero;
        this.qtdAlimentos = qtdAlimentos;
        this.data = data;
        this.entrada = entrada;
        this.saida = saida;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getQtdAlimentos() {
        return qtdAlimentos;
    }

    public void setQtdAlimentos(int qtdAlimentos) {
        this.qtdAlimentos = qtdAlimentos;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getEntrada() {
        return entrada;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    public Date getSaida() {
        return saida;
    }

    public void setSaida(Date saida) {
        this.saida = saida;
    }
    
    
}
