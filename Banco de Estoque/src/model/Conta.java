
package model;

/**
 *
 * @author Ezequiel Ngunga Nhime
 */
public class Conta {
    private long id;
    private int credito;
    private int debito;

    public Conta() {
    }

    public Conta(int credito, int debito) {
        this.credito = credito;
        this.debito = debito;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public int getDebito() {
        return debito;
    }

    public void setDebito(int debito) {
        this.debito = debito;
    }
    
    
}
