package Model;

import net.bytebuddy.implementation.bind.annotation.Super;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Cliente extends PessoaFisica{

    @OneToMany
    private Collection<Frete> frete;

    public Cliente(String nome, String endereco, String telefone, Collection<Frete> frete) {
        super(nome, endereco, telefone);
        this.frete = frete;
    }

    public Cliente() {}

    public Collection<Frete> getFrete() {
        return frete;
    }

    public void setFrete(Collection<Frete> frete) {
        this.frete = frete;
    }
}
