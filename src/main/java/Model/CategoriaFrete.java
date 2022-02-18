package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class CategoriaFrete {

    @Id @GeneratedValue
    private int id;

    @OneToMany
    private Collection<Frete> fretes;

    private double desconto;
    private double percentual;

    public CategoriaFrete(double desconto, double percentual) {
        this.desconto = desconto;
        this.percentual = percentual;
    }

    public CategoriaFrete() {}

    public int getId() {
        return id;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    public Collection<Frete> getFretes() {
        return fretes;
    }

    public void setFretes(Collection<Frete> fretes) {
        this.fretes = fretes;
    }
}
