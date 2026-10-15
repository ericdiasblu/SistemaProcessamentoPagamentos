package entities;

import entities.enums.StatusPagamento;
import entities.enums.TipoPagamento;

import java.time.LocalDateTime;
import java.util.UUID;

public abstract class Pagamento {

    private UUID uuid = UUID.randomUUID();
    private double valor;
    private double taxa;
    private LocalDateTime dataPagamento;
    private StatusPagamento status = StatusPagamento.PENDENTE;
    private String descricao;
    private TipoPagamento tipo;


    public Pagamento() {}

    public Pagamento(double valor, LocalDateTime dataPagamento, StatusPagamento status, String descricao, TipoPagamento tipo) {
        this.valor = valor;
        this.dataPagamento = dataPagamento;
        this.status = status;
        this.descricao = descricao;
        this.tipo = tipo;
    }

    public UUID getUuid() {
        return uuid;
    }

    public double getValor() {
        return valor;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDateTime getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDateTime dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public StatusPagamento getStatus() {
        return status;
    }

    public void setStatus(StatusPagamento status) {
        this.status = status;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoPagamento getTipo() {
        return tipo;
    }

    public void setTipo(TipoPagamento tipo) {
        this.tipo = tipo;
    }

    public abstract void realizarPagamento();

    public abstract void calcularTaxa();

    public abstract void consultarStatus();

    @Override
    public String toString() {
        return "Pagamento{" +
                "valor=" + valor +
                ", taxa=" + taxa +
                ", dataPagamento=" + dataPagamento +
                ", status=" + status +
                ", descricao='" + descricao + '\'' +
                ", tipo=" + tipo +
                ", uuid=" + uuid +
                '}';
    }


}
