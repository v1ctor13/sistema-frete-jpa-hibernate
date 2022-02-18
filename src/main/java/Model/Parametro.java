package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Parametro {

    @Id @GeneratedValue
    private int id;

    private double valorKmRodado;

    public Parametro(double valorKmRodado) {
        this.valorKmRodado = valorKmRodado;
    }

    public Parametro() {}

    public int getId() {
        return id;
    }

    public double getValorKmRodado() {
        return valorKmRodado;
    }

    public void setValorKmRodado(double valorKmRodado) {
        this.valorKmRodado = valorKmRodado;
    }
}
