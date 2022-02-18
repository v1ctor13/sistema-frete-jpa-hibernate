package Model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Cidade {

    @Id @GeneratedValue
    private int id;

    @ManyToMany
    @JoinTable( name="Distancia" )
    private Collection<Cidade> distancias;

    @OneToMany
    private Collection<Frete> fretesOrigem;

    @OneToMany
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
}
