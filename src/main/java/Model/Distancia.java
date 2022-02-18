package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Distancia {

    @Id @GeneratedValue
    private int id;

    private double quilometros;

    public Distancia() {}

    public int getId() {
        return id;
    }

    public double getQuilometros() {
        return quilometros;
    }

    public void setQuilometros(double quilometros) {
        this.quilometros = quilometros;
    }
}
