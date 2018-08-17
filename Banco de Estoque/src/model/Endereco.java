
package model;

/**
 *
 * @author Ezequiel Ngunga Nhime
 */
public class Endereco {
    private long id;
    private int numero;
    private String bairro;
    private String cidade;

    public Endereco() {
    }

    public Endereco(int numero, String bairro, String cidade) {
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
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

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    
}
