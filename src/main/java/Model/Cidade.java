package Model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Cidade {

    @Id @GeneratedValue
    private int id;

    @ManyToMany
    @JoinTable( name = "Distancia",
                joinColumns = @JoinColumn(name = "cidadeOrigem_id"),
                inverseJoinColumns = @JoinColumn(name = "cidadeDestino_id"))
    private Collection<Cidade> distancias;

    @OneToMany(mappedBy = "cidadeOrigem")
    private Collection<Frete> fretesOrigem;

    @OneToMany(mappedBy = "cidadeDestino")
    private Collection<Frete> fretesDestino;

    private String nome;
    private String estado;

    public Cidade(Collection<Cidade> distancias, Collection<Frete> fretesOrigem, Collection<Frete> fretesDestino, String nome, String estado) {
        this.distancias = distancias;
        this.fretesOrigem = fretesOrigem;
        this.fretesDestino = fretesDestino;
        this.nome = nome;
        this.estado = estado;
    }

    public Cidade() {}

    public int getId() {
        return id;
    }

    public Collection<Cidade> getDistancias() {
        return distancias;
    }

    public void setDistancias(Collection<Cidade> distancias) {
        this.distancias = distancias;
    }

    public Collection<Frete> getFretesOrigem() {
        return fretesOrigem;
    }

    public void setFretesOrigem(Collection<Frete> fretesOrigem) {
        this.fretesOrigem = fretesOrigem;
    }

    public Collection<Frete> getFretesDestino() {
        return fretesDestino;
    }

    public void setFretesDestino(Collection<Frete> fretesDestino) {
        this.fretesDestino = fretesDestino;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
