package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class Dependente {

    @Id @GeneratedValue
    private int id;

    private String nome;
    private LocalDate dataNascimento;

    @ManyToOne
    private Funcionario funcionario;

    public Dependente(String nome, LocalDate dataNascimento, Funcionario funcionario) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.funcionario = funcionario;
    }

    public Dependente() {}

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
