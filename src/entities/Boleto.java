package entities;

import entities.enums.StatusPagamento;
import entities.enums.TipoPagamento;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

public class Boleto extends Pagamento{

    private String codigoBarrasNumerico;
    private Date dataEmissao;
    private Date dataVencimento;
    private String beneficiario;

    public Boleto(double valor, LocalDateTime dataPagamento, StatusPagamento status, String descricao, TipoPagamento tipoPagamento, String codigoBarrasNumerico, Date dataEmissao, Date dataVencimento, String beneficiario){
        super(valor, dataPagamento, status, descricao, tipoPagamento);

        this.codigoBarrasNumerico = codigoBarrasNumerico;
        this.dataEmissao = dataEmissao;
        this.dataVencimento = dataVencimento;
        this.beneficiario = beneficiario;
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

    public String getCodigoBarrasNumerico() {
        return codigoBarrasNumerico;
    }

    public void setCodigoBarrasNumerico(String codigoBarrasNumerico) {
        this.codigoBarrasNumerico = codigoBarrasNumerico;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }
}
