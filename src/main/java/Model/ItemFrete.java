package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ItemFrete {

    @Id @GeneratedValue
    private int id;

    @ManyToOne
    private Frete frete;

    public ItemFrete(Frete frete, String descricao, double peso) {
        this.frete = frete;
        this.descricao = descricao;
        this.peso = peso;
    }

    public ItemFrete() {}

    private String descricao;
    private double peso;

    public int getId() {
        return id;
    }

    public Frete getFrete() {
        return frete;
    }

    public void setFrete(Frete frete) {
        this.frete = frete;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
