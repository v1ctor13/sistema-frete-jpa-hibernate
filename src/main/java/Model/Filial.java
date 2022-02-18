package Model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Filial {

    @Id @GeneratedValue
    private int id;

    @OneToMany(mappedBy = "filial")
    private Collection<Funcionario> funcionarios;

    @OneToMany(mappedBy = "filial")
    private Collection<Veiculo> veiculos;

    private String nome;
    private String endereco;
    private String telefone;

    public Filial(Collection<Funcionario> funcionarios, Collection<Veiculo> veiculos, String nome, String endereco, String telefone) {
        this.funcionarios = funcionarios;
        this.veiculos = veiculos;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Filial() {}

    public int getId() {
        return id;
    }

    public void setFuncionarios(Collection<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void setVeiculos(Collection<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Collection<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public Collection<Veiculo> getVeiculos() {
        return veiculos;
    }
}
