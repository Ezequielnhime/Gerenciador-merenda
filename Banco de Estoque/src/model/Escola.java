
package model;

/**
 *
 * @author EZEQUIEL NGUNGA NHIME
 */
public class Escola {
    private Long id;
    private String nome;
    private int telefoneDDD;
    private int telefoneNumero;

    public Escola(String nome, int telefoneDDD, int telefoneNumero) {
        this.nome = nome;
        this.telefoneDDD = telefoneDDD;
        this.telefoneNumero = telefoneNumero;
    }

    public Escola() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefoneDDD() {
        return telefoneDDD;
    }

    public void setTelefoneDDD(int telefoneDDD) {
        this.telefoneDDD = telefoneDDD;
    }

    public int getTelefoneNumero() {
        return telefoneNumero;
    }

    public void setTelefoneNumero(int telefoneNumero) {
        this.telefoneNumero = telefoneNumero;
    }
    
    
}
