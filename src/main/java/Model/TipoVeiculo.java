package Model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class TipoVeiculo {

    @Id @GeneratedValue
    private int id;

    @OneToMany
    private Collection<Veiculo> veiculos;

    private String descricao;
    private int pesoMaximo;

    public TipoVeiculo(Collection<Veiculo> veiculos, String descricao, int pesoMaximo) {
        this.veiculos = veiculos;
        this.descricao = descricao;
        this.pesoMaximo = pesoMaximo;
    }

    public TipoVeiculo() {}

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(int pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    public Collection<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(Collection<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
}
