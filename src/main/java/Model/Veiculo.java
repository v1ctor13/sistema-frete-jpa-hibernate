package Model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Veiculo {

    @Id @GeneratedValue
    private int id;

    @ManyToOne
    private TipoVeiculo tipoVeiculo;

    @ManyToOne
    private Filial filial;

    @OneToMany(mappedBy = "veiculo")
    private Collection<Frete> fretes;

    private String numeroPlaca;

    public Veiculo(TipoVeiculo tipoVeiculo, Filial filial, Collection<Frete> fretes, String numeroPlaca) {
        this.tipoVeiculo = tipoVeiculo;
        this.filial = filial;
        this.fretes = fretes;
        this.numeroPlaca = numeroPlaca;
    }

    public Veiculo() {}

    public int getId() {
        return id;
    }

    public Filial getFilial() {
        return filial;
    }

    public void setFilial(Filial filial) {
        this.filial = filial;
    }

    public Collection<Frete> getFretes() {
        return fretes;
    }

    public void setFretes(Collection<Frete> fretes) {
        this.fretes = fretes;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }
}
