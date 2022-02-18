package Model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Funcionario extends PessoaFisica{

    @Id @GeneratedValue
    private int id;

    private int matricula;

    @ManyToOne
    private Filial filial;

    @OneToMany(mappedBy = "funcionario")
    private Collection<Dependente> dependentes;

    public Funcionario(String nome, String endereco, String telefone, int matricula, Filial filial, Collection<Dependente> dependentes) {
        super(nome, endereco, telefone);
        this.matricula = matricula;
        this.filial = filial;
        this.dependentes = dependentes;
    }

    public Funcionario(){}

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Filial getFilial() {
        return filial;
    }

    public void setFilial(Filial filial) {
        this.filial = filial;
    }

    public Collection<Dependente> getDependentes() {
        return dependentes;
    }

    public void setDependentes(Collection<Dependente> dependentes) {
        this.dependentes = dependentes;
    }
}
