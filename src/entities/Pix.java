package entities;

import entities.enums.StatusPagamento;
import entities.enums.TipoPagamento;

import java.time.LocalDateTime;

public class Pix extends Pagamento {

    private String chavePix;
    private String tipoChave;
    private String nomeRecebedor;
    private String identificadorTransacao;

    public Pix() {}

    public Pix(double valor, LocalDateTime dataPagamento, StatusPagamento status, String descricao, TipoPagamento tipo, String chavePix, String tipoChave, String nomeRecebedor, String identificadorTransacao) {
        super(valor, dataPagamento, status, descricao, tipo);
        this.chavePix = chavePix;
        this.tipoChave = tipoChave;
        this.nomeRecebedor = nomeRecebedor;
        this.identificadorTransacao = identificadorTransacao;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    public String getTipoChave() {
        return tipoChave;
    }

    public void setTipoChave(String tipoChave) {
        this.tipoChave = tipoChave;
    }

    public String getNomeRecebedor() {
        return nomeRecebedor;
    }

    public void setNomeRecebedor(String nomeRecebedor) {
        this.nomeRecebedor = nomeRecebedor;
    }

    public String getIdentificadorTransacao() {
        return identificadorTransacao;
    }

    public void setIdentificadorTransacao(String identificadorTransacao) {
        this.identificadorTransacao = identificadorTransacao;
    }

    @Override
    public String toString() {
        return "Pix{" +
                "chavePix='" + chavePix + '\'' +
                ", tipoChave='" + tipoChave + '\'' +
                ", nomeRecebedor='" + nomeRecebedor + '\'' +
                ", identificadorTransacao='" + identificadorTransacao + '\'' +
                '}';
    }

    @Override
    public void realizarPagamento() {
        System.out.println("O pagamento em PIX foi realizado com sucesso");
    }

    @Override
    public void calcularTaxa() {

    }

    @Override
    public void consultarStatus() {

    }

    @Override
    public void confirmarPagamento() {

    }

    @Override
    public void cancelarPagamento() {

    }

    @Override
    public void validarPagamento() {

    }

    @Override
    public void notificarAlteracao() {

    }

    @Override
    public void consultarPagamento() {

    }
}
