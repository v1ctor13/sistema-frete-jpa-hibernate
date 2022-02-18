package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Distancia {

    @Id @GeneratedValue
    private int id;

    public Distancia() {}
}
