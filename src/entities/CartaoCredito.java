package entities;

import entities.enums.StatusPagamento;
import entities.enums.TipoBandeira;
import entities.enums.TipoPagamento;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CartaoCredito extends Pagamento{
    private String numeroCartao;
    private String nomeTitular;
    private Integer CVV;
    private LocalDate dataValidade;
    private TipoBandeira bandeira;
    private Double limiteDisponivel;
    private Integer qtdParcelas;

    public CartaoCredito(double valor, LocalDateTime dataPagamento, StatusPagamento status, String descricao, TipoPagamento tipo, String numeroCartao, String nomeTitular, Integer CVV, LocalDate dataValidade, TipoBandeira bandeira, Double limiteDisponivel, Integer qtdParcelas) {
        super(valor, dataPagamento, status, descricao, tipo);
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.CVV = CVV;
        this.dataValidade = dataValidade;
        this.bandeira = bandeira;
        this.limiteDisponivel = limiteDisponivel;
        this.qtdParcelas = qtdParcelas;
    }

    @Override
    public void realizarPagamento() {

    }

    @Override
    public void calcularTaxa() {

    }

    @Override
    public void consultarStatus() {

    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public Integer getCVV() {
        return CVV;
    }

    public void setCVV(Integer CVV) {
        this.CVV = CVV;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public TipoBandeira getBandeira() {
        return bandeira;
    }

    public void setBandeira(TipoBandeira bandeira) {
        this.bandeira = bandeira;
    }

    public Double getLimiteDisponivel() {
        return limiteDisponivel;
    }

    public void setLimiteDisponivel(Double limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
    }

    public Integer getQtdParcelas() {
        return qtdParcelas;
    }

    public void setQtdParcelas(Integer qtdParcelas) {
        this.qtdParcelas = qtdParcelas;
    }

    @Override
    public String toString() {
        return "CartaoCredito{" +
                "numeroCartao='" + numeroCartao + '\'' +
                ", nomeTitular='" + nomeTitular + '\'' +
                ", CVV=" + CVV +
                ", dataValidade=" + dataValidade +
                ", bandeira=" + bandeira +
                ", limiteDisponivel=" + limiteDisponivel +
                ", qtdParcelas=" + qtdParcelas +
                '}';
    }
}
