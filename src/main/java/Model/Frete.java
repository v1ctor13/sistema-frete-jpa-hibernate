package Model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Frete {

    @Id @GeneratedValue
    private int id;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private CategoriaFrete categoriaFrete;

    @ManyToOne
    private Veiculo veiculo;

    @ManyToOne
    private Cidade cidadeOrigem;

    @ManyToOne
    private Cidade cidadeDestino;

    @OneToMany(mappedBy = "frete")
    private Collection<ItemFrete> itens;

    @OneToOne
    private Parametro parametro;


    private int codigo;
    private double valor;
    private long numeroNotaFiscal;

    public Frete(Cliente cliente, CategoriaFrete categoriaFrete, Veiculo veiculo, Cidade cidadeOrigem,
                 Cidade cidadeDestino, Collection<ItemFrete> itens, int codigo, double valor, long numeroNotaFiscal) {
        this.cliente = cliente;
        this.categoriaFrete = categoriaFrete;
        this.veiculo = veiculo;
        this.cidadeOrigem = cidadeOrigem;
        this.cidadeDestino = cidadeDestino;
        this.itens = itens;
        this.codigo = codigo;
        this.valor = valor;
        this.numeroNotaFiscal = numeroNotaFiscal;
    }

    public Frete() {}

    public void calcularFrete(Parametro parametro) {
        // calculo do frete
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public CategoriaFrete getCategoriaFrete() {
        return categoriaFrete;
    }

    public void setCategoriaFrete(CategoriaFrete categoriaFrete) {
        this.categoriaFrete = categoriaFrete;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public long getNumeroNotaFiscal() {
        return numeroNotaFiscal;
    }

    public void setNumeroNotaFiscal(long numeroNotaFiscal) {
        this.numeroNotaFiscal = numeroNotaFiscal;
    }

    public Collection<ItemFrete> getItens() {
        return itens;
    }

    public void setItens(Collection<ItemFrete> itens) {
        this.itens = itens;
    }
}
